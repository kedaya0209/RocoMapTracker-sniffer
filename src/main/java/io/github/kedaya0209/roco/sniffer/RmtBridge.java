package io.github.kedaya0209.roco.sniffer;

import lombok.extern.slf4j.Slf4j;
import net.jcip.annotations.NotThreadSafe;
import org.pcap4j.core.*;
import org.pcap4j.packet.*;

import io.github.kedaya0209.roco.sniffer.capture.*;
import io.github.kedaya0209.roco.sniffer.codec.*;
import io.github.kedaya0209.roco.sniffer.data.ConfigDb;
import io.github.kedaya0209.roco.sniffer.extractors.*;

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

    private final String iface;
    private final int port;

    private final FlowManager flowManager;
    private final DecodePipeline pipeline;

    private volatile boolean running;

    private PcapHandle sniffer;

    public RmtBridge(String iface, int port, RmtSender rmtSender, ConfigDb configDb) {
        this.iface = iface;
        this.port = port;

        this.flowManager = new FlowManager();
        ExtractorRegistry registry = ExtractorRegistry.createDefault();
        DecodePipeline dp = new DecodePipeline(registry, null, flowManager, rmtSender);
        ExtractorContext ctx = new ExtractorContext(configDb, dp::enqueueIo);
        dp.setContext(ctx);
        this.pipeline = dp;
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

        Direction direction;
        String clientIp;
        int clientPort;
        if (dstPort == port) {
            direction = Direction.C2S;
            clientIp = srcIp;
            clientPort = srcPort;
        } else {
            direction = Direction.S2C;
            clientIp = dstIp;
            clientPort = dstPort;
        }
        String serverIp = dstPort == port ? dstIp : srcIp;
        FlowKey flowKey = new FlowKey(clientIp, clientPort, serverIp, port);

        long seq = tcp.getHeader().getSequenceNumberAsLong();

        // 获取或创建流
        FlowState flow = flowManager.getOrCreate(flowKey, clientIp, clientPort, serverIp, port);

        try {
            int frameCount = 0;
            for (Be21Packet be21 : flow.directionState(direction).feed(seq, payload)) {
                pipeline.enqueueFrame(be21, flow, flowKey);
                frameCount++;
            }
            if (frameCount > 0) {
                flowManager.markFrameReceived(flowKey);
            }
        } catch (Exception ignored) {
        }

        // 流卡死检测
        FlowState newFlow = flowManager.detectAndRebuildStalled(
                flowKey, direction, seq, payload, clientIp, clientPort, serverIp, port);
        if (newFlow != null) {
            for (Be21Packet be21 : newFlow.directionState(direction).feed(seq, payload)) {
                pipeline.enqueueFrame(be21, newFlow, flowKey);
            }
        }
    }

    // ── 生命周期 ──

    public void start() throws PcapNativeException, NotOpenException {
        running = true;
        pipeline.start();

        PcapNetworkInterface nif = Pcaps.getDevByName(iface);
        if (nif == null) {
            log.error("网卡不存在: {}", iface);
            return;
        }
        sniffer = nif.openLive(65536, PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, 100);
        String bpf = "tcp port " + port;
        sniffer.setFilter(bpf, BpfProgram.BpfCompileMode.OPTIMIZE);

        log.info("场景监听已启动: iface={} port={}  解码线程=2 IO线程=1", iface, port);

        while (running) {
            Packet packet = sniffer.getNextPacket();
            if (packet != null) onPacket(packet);
        }
    }

    public void stop() {
        running = false;
        pipeline.stop();
        if (sniffer != null) {
            try { sniffer.close(); } catch (Exception ignored) {}
        }
    }
}
