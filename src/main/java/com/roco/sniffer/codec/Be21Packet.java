package com.roco.sniffer.codec;

/**
 * BE21 协议帧数据。
 * <p>
 * BE21 帧结构:
 * <pre>
 * [0:2]   magic   = 0x33 0x66
 * [2:6]   (reserved)
 * [6:8]   cmd     (big-endian uint16)
 * [8]     (reserved)
 * [9:13]  seq     (big-endian uint32)
 * [13:17] hdr_len (big-endian uint32, 含 fixed header)
 * [17:21] body_len(big-endian uint32)
 * [21:hdr_len] header_extra
 * [hdr_len:hdr_len+body_len] body
 * </pre>
 */
public record Be21Packet(
        String direction,
        long streamOffset,
        int cmd,
        long seq,
        int hdrLen,
        int bodyLen,
        byte[] headerExtra,
        byte[] body
) {
    /** 0x1002: 密钥交换握手包 */
    public static final int CMD_KEY_EXCHANGE = 0x1002;
    /** 0x4013: AES 加密数据包 */
    public static final int CMD_ENCRYPTED_DATA = 0x4013;

    public boolean isKeyExchange() {
        return cmd == CMD_KEY_EXCHANGE;
    }

    public boolean isEncryptedData() {
        return cmd == CMD_ENCRYPTED_DATA;
    }
}
