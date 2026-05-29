package com.roco.sniffer;

import com.roco.sniffer.codec.MessageCodec;
import com.roco.sniffer.codec.MessageType;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
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
            sendMsg(MessageType.HELLO.value(), MessageCodec.encodeHello("rkpp-bridge"));
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

    private boolean ensureConnected() {
        if (!connected || socket == null || socket.isClosed()) {
            return tryReconnect();
        }
        return true;
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
