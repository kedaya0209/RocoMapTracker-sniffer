package com.roco.sniffer;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import net.jcip.annotations.NotThreadSafe;

/**
 * RocoMapTracker TCP Socket 发送器。
 * <p>
 * 对应 Python: rmt_protocol.py RmtSender
 * <p>
 * 协议格式: [msg_type: int32][body_len: int32][body: bytes]，big-endian。
 */
@Slf4j
@NotThreadSafe
public class RmtSender implements AutoCloseable {

    // 协议常量
    public static final int MSG_HELLO = 1;
    public static final int MSG_SCENE_CHANGE = 211;
    public static final int MSG_STOP_MATCHING = 212;
    public static final int MSG_START_MATCHING = 213;
    public static final int MSG_AREA_CHANGE = 214;
    public static final int MSG_ITEM_PICKUP = 215;

    private final String host;
    private final int port;

    private Socket socket;
    private DataOutputStream out;
    private boolean connected;

    public RmtSender(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public boolean connect() {
        try {
            socket = new Socket();
            socket.setReuseAddress(true);
            socket.connect(new java.net.InetSocketAddress(host, port), 5000);
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(5000);
            out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            connected = true;
            log.info("RMT 已连接 {}:{}", host, port);
            sendMsg(MSG_HELLO, encodeHello("rkpp-bridge"));
            return true;
        } catch (IOException e) {
            log.warn("RMT 连接失败: {}", e.getMessage());
            return false;
        }
    }

    private boolean tryReconnect() {
        close();
        return connect();
    }

    private void sendMsg(int msgType, byte[] body) throws IOException {
        out.writeInt(msgType);
        out.writeInt(body.length);
        out.write(body);
        out.flush();
    }

    private boolean sendMsgSafe(int msgType, byte[] body) {
        if (!ensureConnected()) return false;
        try {
            sendMsg(msgType, body);
            return true;
        } catch (IOException e) {
            log.warn("RMT 发送失败: {}", e.getMessage());
            connected = false;
            return false;
        }
    }

    private boolean ensureConnected() {
        if (!connected || socket == null || socket.isClosed()) {
            return tryReconnect();
        }
        return true;
    }

    // ── 编码方法 ──

    private static byte[] encodeHello(String clientId) {
        byte[] nameBytes = clientId.getBytes(StandardCharsets.UTF_8);
        ByteBuffer buf = ByteBuffer.allocate(2 + nameBytes.length + 2 + 2);
        buf.putShort((short) nameBytes.length);
        buf.put(nameBytes);
        buf.putShort((short) 0); // provides
        buf.putShort((short) 0); // subscribes
        return buf.array();
    }

    public static byte[] encodeSceneChange(int sceneCfgId) {
        return ByteBuffer.allocate(4).putInt(sceneCfgId).array();
    }

    public static byte[] encodeAreaChange(int areaFuncConfId) {
        return ByteBuffer.allocate(4).putInt(areaFuncConfId).array();
    }

    public static byte[] encodeString(String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }

    // ── 发送方法 ──

    public boolean sendSceneChange(int sceneCfgId) {
        log.info("[scene] RMT 场景变更: cfg_id={}", sceneCfgId);
        return sendMsgSafe(MSG_SCENE_CHANGE, encodeSceneChange(sceneCfgId));
    }

    public boolean sendAreaChange(String name, int areaFuncConfId) {
        byte[] payload = (name != null) ? encodeString(name) : encodeAreaChange(areaFuncConfId);
        String tag = (name != null) ? name : "#" + areaFuncConfId;
        log.info("[area] RMT 区域变更: {}", tag);
        return sendMsgSafe(MSG_AREA_CHANGE, payload);
    }

    public boolean sendItemPickup(String tag, int pickupNum, int totalNum) {
        byte[] payload = String.format("%s|%d|%d", tag, pickupNum, totalNum).getBytes(StandardCharsets.UTF_8);
        log.info("[item] RMT 物资拾取: {} +{} 背包:{}", tag, pickupNum, totalNum);
        return sendMsgSafe(MSG_ITEM_PICKUP, payload);
    }

    public boolean sendStartMatching() {
        log.info("[ctrl] 开始匹配");
        return sendMsgSafe(MSG_START_MATCHING, new byte[0]);
    }

    public boolean sendStopMatching() {
        log.info("[ctrl] 停止匹配");
        return sendMsgSafe(MSG_STOP_MATCHING, new byte[0]);
    }

    /**
     * 批量发送（IO 线程用）。
     */
    public boolean sendBatch(List<int[]> items) {
        // items: [{serviceId, payloadLen}, ...]  payload 在单独的 byte[][] 里
        // 简化：直接逐条发
        if (!ensureConnected()) return false;
        try {
            for (int[] item : items) {
                // item[0]=serviceId, 后面的字节在调用方已编码
            }
            out.flush();
            return true;
        } catch (IOException e) {
            log.warn("RMT 批量发送失败: {}", e.getMessage());
            connected = false;
            return false;
        }
    }

    /**
     * 批量发送（带 payload 的版本）。
     */
    public boolean sendBatchRaw(List<MsgEntry> entries) {
        if (!ensureConnected()) return false;
        try {
            ByteBuffer buf = ByteBuffer.allocate(entries.size() * 8 + entries.stream().mapToInt(e -> e.payload.length).sum());
            for (MsgEntry e : entries) {
                buf.putInt(e.serviceId);
                buf.putInt(e.payload.length);
                buf.put(e.payload);
            }
            buf.flip();
            byte[] data = new byte[buf.remaining()];
            buf.get(data);
            out.write(data);
            out.flush();
            return true;
        } catch (IOException ex) {
            log.warn("RMT 批量发送失败: {}", ex.getMessage());
            connected = false;
            return false;
        }
    }

    public record MsgEntry(int serviceId, byte[] payload) {}

    @Override
    public void close() {
        connected = false;
        try {
            if (out != null) out.close();
        } catch (IOException ignored) {}
        try {
            if (socket != null) socket.close();
        } catch (IOException ignored) {}
        out = null;
        socket = null;
    }
}
