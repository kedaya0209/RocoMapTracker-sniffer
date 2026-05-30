package io.github.kedaya0209.roco.sniffer.capture;

import io.github.kedaya0209.roco.sniffer.codec.Be21Packet;
import io.github.kedaya0209.roco.sniffer.codec.Direction;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

/**
 * TCP 流状态管理：流的创建、停滞检测、周期性重建、密钥传播。
 */
@Slf4j
public class FlowManager {

    private static final int FLOW_STALL_SEC = 30;
    private static final int FLOW_REBUILD_INTERVAL_SEC = 300;

    private final ConcurrentHashMap<FlowKey, FlowState> flows = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<FlowKey, Long> flowLastFrame = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<FlowKey, Long> flowFirstPacket = new ConcurrentHashMap<>();
    private volatile byte[] globalKey;
    private volatile long lastFlowRebuild = System.nanoTime();

    /**
     * 获取或创建流。
     */
    public FlowState getOrCreate(FlowKey key, String clientIp, int clientPort,
                                 String serverIp, int serverPort) {
        return flows.computeIfAbsent(key, k -> {
            flowFirstPacket.put(k, System.nanoTime());
            return new FlowState(k.toString(), clientIp, clientPort,
                    serverIp, serverPort, globalKey);
        });
    }

    /**
     * 标记流有新帧。
     */
    public void markFrameReceived(FlowKey key) {
        flowLastFrame.put(key, System.nanoTime());
    }

    /**
     * 检测流是否卡死，若是则重建。返回新流（若重建）或 null。
     */
    public FlowState detectAndRebuildStalled(FlowKey key, Direction direction,
                                             long seq, byte[] payload,
                                             String clientIp, int clientPort,
                                             String serverIp, int serverPort) {
        long now = System.nanoTime();
        Long lastFrame = flowLastFrame.get(key);
        Long firstPkt = flowFirstPacket.get(key);
        long lastFrameNs = lastFrame != null ? lastFrame : 0;
        long firstPktNs = firstPkt != null ? firstPkt : now;
        double ageSec = (now - (lastFrameNs > 0 ? lastFrameNs : firstPktNs)) / 1e9;
        boolean stalled = ageSec > FLOW_STALL_SEC;

        if (!stalled) return null;

        log.info("流 {} 卡死 ({}s 无帧)，重建", key, (int) ageSec);
        flows.remove(key);
        flowLastFrame.remove(key);
        flowFirstPacket.remove(key);
        FlowState newFlow = new FlowState(key.toString(), clientIp, clientPort,
                serverIp, serverPort, globalKey);
        flows.put(key, newFlow);
        flowFirstPacket.put(key, now);
        return newFlow;
    }

    /**
     * 传播密钥到所有无密钥的流。
     */
    public void propagateKey(byte[] key) {
        this.globalKey = key;
        flows.values().forEach(f -> {
            if (f.getKey() == null) f.setKey(key);
        });
    }

    /** 获取当前全局密钥。 */
    public byte[] globalKey() {
        return globalKey;
    }

    /**
     * 周期性重建所有流（释放 TCP 重组缓冲区）。
     */
    public void rebuildPeriodic() {
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
}
