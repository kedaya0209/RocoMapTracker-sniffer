package com.roco.sniffer;

import lombok.extern.slf4j.Slf4j;
import net.jcip.annotations.NotThreadSafe;
import org.pcap4j.core.*;
import org.pcap4j.packet.*;

import com.roco.sniffer.capture.*;
import com.roco.sniffer.codec.*;
import com.roco.sniffer.data.ConfigDb;

import java.util.*;
import java.util.concurrent.*;

/**
 * RMT 桥接器：抓包 → 解密 → opcode 过滤 → 事件提取 → 推送到 RocoMapTracker。
 * <p>
 * 对应 Python: rmt_bridge.py RmtBridge
 * <p>
 * Pipeline: 抓包线程 → packetPool → 解码线程(×2) → ioPool → IO线程 → RMT
 */
@Slf4j
@NotThreadSafe
public class RmtBridge {

    // ── 常量 ──

    private static final int IO_FLUSH_INTERVAL_MS = 50;
    private static final int FLOW_STALL_SEC = 30;
    private static final int FLOW_REBUILD_INTERVAL_SEC = 300;

    /** 解密后需要继续处理的 opcode 集合（注册的提取器 + 战斗状态跟踪） */
    private final Set<Integer> interestingOpcodes;


    // ── 配置 ──
    private final String iface;
    private final int port;
    private final RmtSender rmtSender;
    private final ExtractorRegistry registry;
    private final ExtractorContext ctx;

    // ── 流状态 ──
    private final ConcurrentHashMap<String, FlowState> flows = new ConcurrentHashMap<>();
    private volatile byte[] globalKey;

    // ── Pipeline ──
    private final BlockingQueue<PendingFrame> packetPool = new LinkedBlockingQueue<>();
    private final PriorityBlockingQueue<IoEntry> ioPool = new PriorityBlockingQueue<>();

    // ── 状态 ──
    private volatile boolean running;

    // ── 统计 ──
    private long statTotal, stat4013, statScene, statIoSent;
    private long lastCaptureTime, lastDecodeTime;

    // ── 流健康 ──
    private final ConcurrentHashMap<String, Long> flowLastFrame = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Long> flowFirstPacket = new ConcurrentHashMap<>();
    private volatile long lastFlowRebuild = System.nanoTime();

    private PcapHandle sniffer;

    public RmtBridge(String iface, int port, RmtSender rmtSender, ConfigDb configDb) {
        this.iface = iface;
        this.port = port;
        this.rmtSender = rmtSender;

        // 构建提取器注册表
        this.registry = ExtractorRegistry.createDefault();
        this.ctx = new ExtractorContext(configDb,
                (serviceId, payload) -> ioPool.offer(
                        new IoEntry(System.nanoTime(), 0, serviceId, payload)));

        // 解密后过滤：只处理有提取器的 opcode
        this.interestingOpcodes = Set.copyOf(registry.registeredOpcodes());
    }

    // ── 抓包入口 ──

    private void onPacket(Packet packet) {
        try {
            processPacket(packet);
        } catch (Exception e) {
            log.warn("onPacket 异常: {}: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    private void processPacket(Packet packet) {
        TcpPacket tcp = packet.get(TcpPacket.class);
        if (tcp == null) return;

        IpV4Packet ipv4 = packet.get(IpV4Packet.class);
        IpV6Packet ipv6 = packet.get(IpV6Packet.class);
        if (ipv4 == null && ipv6 == null) return;

        int srcPort = tcp.getHeader().getSrcPort().valueAsInt();
        int dstPort = tcp.getHeader().getDstPort().valueAsInt();
        if (srcPort != port && dstPort != port) return;

        statTotal++;
        byte[] payload = tcp.getPayload() != null ? tcp.getPayload().getRawData() : null;
        if (payload == null || payload.length == 0) return;

        String srcIp, dstIp;
        if (ipv4 != null) {
            srcIp = ipv4.getHeader().getSrcAddr().getHostAddress();
            dstIp = ipv4.getHeader().getDstAddr().getHostAddress();
        } else {
            srcIp = ipv6.getHeader().getSrcAddr().getHostAddress();
            dstIp = ipv6.getHeader().getDstAddr().getHostAddress();
        }

        String direction;
        String clientIp;
        int clientPort;
        if (dstPort == port) {
            direction = "c2s";
            clientIp = srcIp;
            clientPort = srcPort;
        } else {
            direction = "s2c";
            clientIp = dstIp;
            clientPort = dstPort;
        }
        String flowKey = clientIp + ":" + clientPort + "->" + (dstPort == port ? dstIp : srcIp) + ":" + port;

        long seq = tcp.getHeader().getSequenceNumberAsLong();
        long now = System.nanoTime();

        // 获取或创建流
        FlowState flow = flows.computeIfAbsent(flowKey, k -> {
            flowFirstPacket.put(k, now);
            return new FlowState(k, clientIp, clientPort,
                    dstPort == port ? dstIp : srcIp, port, globalKey);
        });

        try {
            int frameCount = 0;
            for (Be21Packet be21 : flow.directionState(direction).feed(seq, payload)) {
                packetPool.offer(new PendingFrame(be21, flow, flowKey, now));
                frameCount++;
            }
            if (frameCount > 0) {
                flowLastFrame.put(flowKey, now);
                lastCaptureTime = now;
            }
        } catch (Exception ignored) {
        }

        // 流卡死检测
        Long lastFrame = flowLastFrame.get(flowKey);
        Long firstPkt = flowFirstPacket.get(flowKey);
        long lastFrameNs = lastFrame != null ? lastFrame : 0;
        long firstPktNs = firstPkt != null ? firstPkt : now;
        double ageSec = (now - (lastFrameNs > 0 ? lastFrameNs : firstPktNs)) / 1e9;
        boolean stalled = (lastFrameNs > 0 && ageSec > FLOW_STALL_SEC)
                || (lastFrameNs == 0 && ageSec > FLOW_STALL_SEC);

        if (stalled) {
            log.info("流 {} 卡死 ({:.0f}s 无帧)，重建", flowKey, ageSec);
            flows.remove(flowKey);
            flowLastFrame.remove(flowKey);
            flowFirstPacket.remove(flowKey);
            FlowState newFlow = new FlowState(flowKey, clientIp, clientPort,
                    dstPort == port ? dstIp : srcIp, port, globalKey);
            flows.put(flowKey, newFlow);
            flowFirstPacket.put(flowKey, now);
            for (Be21Packet be21 : newFlow.directionState(direction).feed(seq, payload)) {
                packetPool.offer(new PendingFrame(be21, newFlow, flowKey, now));
            }
        }
    }

    // ── 解码线程 ──

    private void decodeLoop() {
        while (running) {
            try {
                PendingFrame pf = packetPool.poll(1, TimeUnit.SECONDS);
                if (pf == null) continue;
                handleBe21(pf);
                lastDecodeTime = System.nanoTime();
            } catch (InterruptedException ignored) {
            } catch (Exception e) {
                log.warn("decode 异常: {}", e.getMessage());
            }
        }
    }

    private void handleBe21(PendingFrame pf) {
        Be21Packet be21 = pf.be21;
        FlowState flow = pf.flow;

        // 密钥提取（从 header_extra，offset 2:18）
        if (be21.isKeyExchange() && be21.headerExtra().length >= 18) {
            byte[] key = Arrays.copyOfRange(be21.headerExtra(), 2, 18);
            flow.setKey(key);
            globalKey = key;
            flows.values().forEach(f -> { if (f.getKey() == null) f.setKey(key); });
        }

        if (!be21.isEncryptedData()) return;

        byte[] key = flow.getKey();
        if (key == null) {
            if (globalKey != null) flow.setKey(globalKey);
            else return;
            key = flow.getKey();
        }
        stat4013++;

        // 解密
        Decryptor.DecryptResult[] candidates;
        try {
            candidates = Decryptor.decryptCandidates(key, be21.body());
        } catch (IllegalArgumentException e) {
            // 尝试 globalKey
            if (globalKey != null && !Arrays.equals(key, globalKey)) {
                flow.setKey(globalKey);
                try {
                    candidates = Decryptor.decryptCandidates(globalKey, be21.body());
                } catch (IllegalArgumentException e2) {
                    return;
                }
            } else return;
        }

        for (Decryptor.DecryptResult result : candidates) {
            try {
                byte[] plain = result.plaintext();
                Integer opcode = OpcodeReader.peek(plain, be21.direction());
                if (opcode == null || !interestingOpcodes.contains(opcode)) continue;

                // 战斗状态跟踪
                if (opcode == 0x1316) ctx.inBattle(true);
                else if (opcode == 0x132C) ctx.inBattle(false);

                // 传输层解析
                ProtoParser.Record record = ProtoParser.parseRecord(plain, be21.direction());
                if (record == null) continue;

                // 分发到提取器
                handleEvent(opcode, record.payload());

            } catch (Exception ignored) {
            }
        }
    }

    private void handleEvent(int opcode, byte[] payload) {
        registry.handle(opcode, payload, ctx);
    }

    // ── IO 线程 ──

    private void ioLoop() {
        while (running) {
            try {
                Thread.sleep(IO_FLUSH_INTERVAL_MS);
                if (!running) break;
                rebuildFlowsPeriodic();
                flushIo();
            } catch (InterruptedException ignored) {
            }
        }
    }

    private void rebuildFlowsPeriodic() {
        long now = System.nanoTime();
        if ((now - lastFlowRebuild) / 1e9 < FLOW_REBUILD_INTERVAL_SEC) return;
        lastFlowRebuild = now;
        int count = flows.size();
        if (count == 0) return;
        flows.clear();
        flowLastFrame.clear();
        flowFirstPacket.clear();
        log.info("重建 {} 个流，释放 TCP 重组缓冲区", count);
    }

    private void flushIo() {
        List<RmtSender.MsgEntry> entries = new ArrayList<>();
        IoEntry ie;
        while ((ie = ioPool.poll()) != null) {
            entries.add(new RmtSender.MsgEntry(ie.serviceId, ie.payload));
        }
        if (entries.isEmpty()) return;
        statIoSent += entries.size();
        rmtSender.sendBatchRaw(entries);
    }

    // ── 生命周期 ──

    public void start() throws PcapNativeException, NotOpenException {
        running = true;

        // 解码线程 ×2
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(this::decodeLoop, "decode-" + i);
            t.setDaemon(true);
            t.start();
        }

        // IO 线程
        Thread ioThread = new Thread(this::ioLoop, "io-writer");
        ioThread.setDaemon(true);
        ioThread.start();

        // 抓包
        PcapNetworkInterface nif = Pcaps.getDevByName(iface);
        if (nif == null) {
            log.error("网卡不存在: {}", iface);
            return;
        }
        sniffer = nif.openLive(65536, PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, 100);
        String bpf = "tcp port " + port;
        sniffer.setFilter(bpf, BpfProgram.BpfCompileMode.OPTIMIZE);

        log.info("场景监听已启动: iface={} port={}  解码线程=2 IO线程=1", iface, port);

        // 主循环
        while (running) {
            Packet packet = sniffer.getNextPacket();
            if (packet != null) onPacket(packet);
        }
    }


    public void stop() {
        running = false;
        if (sniffer != null) {
            try { sniffer.close(); } catch (Exception ignored) {}
        }
        rmtSender.close();
    }

    // ── 内部类型 ──

    private record PendingFrame(Be21Packet be21, FlowState flow, String flowKey, long capTimeNs) {}

    private record IoEntry(long timestampNs, long seq, int serviceId, byte[] payload)
            implements Comparable<IoEntry> {
        @Override
        public int compareTo(IoEntry other) {
            return Long.compare(this.timestampNs, other.timestampNs);
        }
    }
}
