package io.github.kedaya0209.roco.sniffer.codec;

import net.jcip.annotations.ThreadSafe;

/**
 * 从解密后的 0x4013 body 中快速提取 opcode，不做 protobuf 解析。
 * <p>
 * 对应 Python: rmt_bridge.py peek_opcode()
 */
@ThreadSafe
public class OpcodeReader {

    /** s2c 传输层魔术字节 */
    private static final byte[] MAGIC_S2C = {0x55, (byte) 0xAA};
    /** c2s 传输层魔术字节 */
    private static final byte[] MAGIC_C2S_1 = {0x39, 0x63};
    private static final byte[] MAGIC_C2S_2 = {0x7C, (byte) 0xA2};

    /**
     * 从解密后的 body 中提取 opcode。
     *
     * @param body      解密后的明文
     * @param direction 方向
     * @return opcode，或 null（无法识别）
     */
    public static Integer peek(byte[] body, Direction direction) {
        if (body == null) return null;

        // s2c: magic 0x55AA at body[4:6], opcode at body[0:4] (big-endian)
        if (direction == Direction.S2C && body.length >= 10) {
            if (body[4] == MAGIC_S2C[0] && body[5] == MAGIC_S2C[1]) {
                int op = readUint32BE(body, 0);
                return (op > 0 && op <= 0xFFFF) ? op : null;
            }
        }

        // c2s: magic 0x3963 or 0x7CA2 at body[8:10], raw_opcode at body[4:8]
        if (direction == Direction.C2S && body.length >= 14) {
            boolean magic1 = body[8] == MAGIC_C2S_1[0] && body[9] == MAGIC_C2S_1[1];
            boolean magic2 = body[8] == MAGIC_C2S_2[0] && body[9] == MAGIC_C2S_2[1];
            if (magic1 || magic2) {
                int raw = readUint32BE(body, 4);
                if (raw <= 0) return null;
                int low = raw & 0xFFFF;
                int high = raw >>> 16;
                if ((high == 0 || high == 1) && low != 0) return low;
                return raw;
            }
        }

        return null;
    }

    private static int readUint32BE(byte[] data, int off) {
        return ((data[off] & 0xFF) << 24)
                | ((data[off + 1] & 0xFF) << 16)
                | ((data[off + 2] & 0xFF) << 8)
                | (data[off + 3] & 0xFF);
    }
}
