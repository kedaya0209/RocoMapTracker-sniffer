package com.roco.sniffer.capture;

import com.roco.sniffer.codec.Direction;
import lombok.Getter;
import lombok.Setter;
import net.jcip.annotations.NotThreadSafe;

/**
 * 单个 TCP 流的状态：持有 AES 密钥 + 两个方向的 TCP 流重组器。
 */
@NotThreadSafe
public class FlowState {

    @Getter
    private final String flowId;
    @Getter
    private final String clientIp;
    @Getter
    private final int clientPort;
    @Getter
    private final String serverIp;
    @Getter
    private final int serverPort;

    /** AES-128 密钥（从 0x1002 握手包提取） */
    @Getter
    @Setter
    private volatile byte[] key;

    private final DirectionState c2s = new DirectionState(Direction.C2S);
    private final DirectionState s2c = new DirectionState(Direction.S2C);

    public FlowState(String flowId, String clientIp, int clientPort,
                     String serverIp, int serverPort, byte[] presetKey) {
        this.flowId = flowId;
        this.clientIp = clientIp;
        this.clientPort = clientPort;
        this.serverIp = serverIp;
        this.serverPort = serverPort;
        this.key = presetKey;
    }

    public DirectionState directionState(Direction direction) {
        return direction == Direction.C2S ? c2s : s2c;
    }
}
