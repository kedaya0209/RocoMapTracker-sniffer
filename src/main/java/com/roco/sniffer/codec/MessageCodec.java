package com.roco.sniffer.codec;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;


/**
 * RMT 协议消息编码工具（纯函数，无状态）。
 * <p>
 * 从 RmtSender 中提取的静态编码方法，wire format 不变。
 */
public final class MessageCodec {

    private MessageCodec() {}

    public static byte[] encodeHello(String clientId) {
        byte[] nameBytes = clientId.getBytes(StandardCharsets.UTF_8);
        ByteBuffer buf = ByteBuffer.allocate(2 + nameBytes.length + 2 + 2);
        buf.putShort((short) nameBytes.length);
        buf.put(nameBytes);
        buf.putShort((short) 0); // provides
        buf.putShort((short) 0); // subscribes
        return buf.array();
    }
}
