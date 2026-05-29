package com.roco.sniffer;

import com.roco.sniffer.capture.FlowKey;
import com.roco.sniffer.capture.FlowManager;
import com.roco.sniffer.capture.FlowState;
import com.roco.sniffer.codec.*;
import com.roco.sniffer.extractors.*;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.*;

/**
 * 解码 + IO 管线：从 packetPool 消费 BE21 帧，解密、解析、分发到提取器，
 * 通过 ioPool 缓冲后批量推送到 RMT。
 */
@Slf4j
public class DecodePipeline {

    private final ExtractorRegistry registry;
    private final FlowManager flowManager;
    private final RmtSender rmtSender;
    private final Set<Integer> interestingOpcodes;

    private ExtractorContext ctx;

    private final BlockingQueue<PendingFrame> packetPool = new LinkedBlockingQueue<>();
    private final PriorityBlockingQueue<IoEntry> ioPool = new PriorityBlockingQueue<>();

    private volatile boolean running;

    public DecodePipeline(ExtractorRegistry registry, ExtractorContext ctx,
                          FlowManager flowManager, RmtSender rmtSender) {
        this.registry = registry;
        this.ctx = ctx;
        this.flowManager = flowManager;
        this.rmtSender = rmtSender;
        this.interestingOpcodes = Set.copyOf(registry.registeredOpcodes());
    }

    /** 延迟设置 ExtractorContext（解决构造循环依赖）。 */
    public void setContext(ExtractorContext ctx) {
        this.ctx = ctx;
    }

    /** 将抓到的帧入队，由解码线程消费。 */
    public void enqueueFrame(Be21Packet be21, FlowState flow, FlowKey flowKey) {
        packetPool.offer(new PendingFrame(be21, flow, flowKey));
    }

    /** 将消息入队到 IO 缓冲池。 */
    public void enqueueIo(int serviceId, byte[] payload) {
        ioPool.offer(new IoEntry(System.nanoTime(), serviceId, payload));
    }

    /** 启动解码和 IO 线程。 */
    public void start() {
        running = true;
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(this::decodeLoop, "decode-" + i);
            t.setDaemon(true);
            t.start();
        }
        Thread ioThread = new Thread(this::ioLoop, "io-writer");
        ioThread.setDaemon(true);
        ioThread.start();
    }

    /** 停止所有线程。 */
    public void stop() {
        running = false;
    }

    // ── 解码线程 ──

    private void decodeLoop() {
        while (running) {
            try {
                PendingFrame pf = packetPool.poll(1, TimeUnit.SECONDS);
                if (pf == null) continue;
                handleBe21(pf);
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
            flowManager.propagateKey(key);
        }

        if (!be21.isEncryptedData()) return;

        byte[] key = flow.getKey();
        if (key == null) {
            byte[] globalKey = flowManager.globalKey();
            if (globalKey != null) flow.setKey(globalKey);
            else return;
            key = flow.getKey();
        }

        // 解密
        Decryptor.DecryptResult[] candidates;
        try {
            candidates = Decryptor.decryptCandidates(key, be21.body());
        } catch (IllegalArgumentException e) {
            byte[] globalKey = flowManager.globalKey();
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

                // 传输层解析
                ProtoParser.Record record = ProtoParser.parseRecord(plain, be21.direction());
                if (record == null) continue;

                // 分发到提取器
                registry.handle(opcode, record.payload(), ctx);

            } catch (Exception ignored) {
            }
        }
    }

    // ── IO 线程 ──

    private void ioLoop() {
        while (running) {
            try {
                Thread.sleep(50);
                if (!running) break;
                flowManager.rebuildPeriodic();
                flushIo();
            } catch (InterruptedException ignored) {
            }
        }
    }

    private void flushIo() {
        List<RmtSender.MsgEntry> entries = new ArrayList<>();
        IoEntry ie;
        while ((ie = ioPool.poll()) != null) {
            entries.add(new RmtSender.MsgEntry(ie.serviceId, ie.payload));
        }
        if (entries.isEmpty()) return;
        rmtSender.sendBatchRaw(entries);
    }

    // ── 内部类型 ──

    record PendingFrame(Be21Packet be21, FlowState flow, FlowKey flowKey) {}

    private record IoEntry(long timestampNs, int serviceId, byte[] payload)
            implements Comparable<IoEntry> {
        @Override
        public int compareTo(IoEntry other) {
            return Long.compare(this.timestampNs, other.timestampNs);
        }
    }
}
