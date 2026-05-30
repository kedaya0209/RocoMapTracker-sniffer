package io.github.kedaya0209.roco.sniffer.codec;

import java.util.ArrayList;
import java.util.List;

import net.jcip.annotations.ThreadSafe;

/**
 * BE21 帧解析器：从连续字节流中扫描并提取 BE21 帧。
 * <p>
 * 对应 Python: rkpp_network.py parse_be21_from_buffer()
 */
@ThreadSafe
public class Be21Parser {

    public static final byte[] MAGIC = {0x33, 0x66};
    public static final int FIXED_HDR_LEN = 21;
    public static final int MAX_FRAME_SIZE = 4 * 1024 * 1024; // 4MB

    /**
     * 从 buffer 中解析 BE21 帧。
     *
     * @param buffer    字节流缓冲区
     * @param direction 方向
     * @param start     起始偏移
     * @return 解析结果：帧列表 + 新的解析偏移
     */
    public static ParseResult parse(byte[] buffer, Direction direction, int start) {
        List<Be21Packet> packets = new ArrayList<>();
        int off = start;
        int size = buffer.length;

        while (off + FIXED_HDR_LEN <= size) {
            // 检查魔术字节
            if (buffer[off] != MAGIC[0] || buffer[off + 1] != MAGIC[1]) {
                int nxt = findMagic(buffer, off + 1);
                if (nxt < 0) break;
                off = nxt;
                continue;
            }

            // 校验头部
            if (!validateHeader(buffer, off)) {
                off += 2;
                continue;
            }

            int cmd = readUint16BE(buffer, off + 6);
            long seq = readUint32BE(buffer, off + 9);
            int hdrLen = readUint32BEAsInt(buffer, off + 13);
            int bodyLen = readUint32BEAsInt(buffer, off + 17);
            int pktLen = hdrLen + bodyLen;

            // 帧不完整，等待更多数据
            if (off + pktLen > size) break;

            byte[] headerExtra = new byte[hdrLen - FIXED_HDR_LEN];
            System.arraycopy(buffer, off + FIXED_HDR_LEN, headerExtra, 0, headerExtra.length);

            byte[] body = new byte[bodyLen];
            System.arraycopy(buffer, off + hdrLen, body, 0, bodyLen);

            packets.add(new Be21Packet(direction, off, cmd, seq, hdrLen, bodyLen, headerExtra, body));
            off += pktLen;
        }

        return new ParseResult(packets, off);
    }

    private static boolean validateHeader(byte[] data, int off) {
        if (off + FIXED_HDR_LEN > data.length) return false;
        int cmd = readUint16BE(data, off + 6);
        int hdrLen = readUint32BEAsInt(data, off + 13);
        int bodyLen = readUint32BEAsInt(data, off + 17);
        if (cmd < 0x0001 || cmd > 0x7FFF) return false;
        if (hdrLen < FIXED_HDR_LEN) return false;
        if ((long) hdrLen + bodyLen > MAX_FRAME_SIZE) return false;
        return true;
    }

    private static int findMagic(byte[] data, int from) {
        for (int i = from; i < data.length - 1; i++) {
            if (data[i] == MAGIC[0] && data[i + 1] == MAGIC[1]) return i;
        }
        return -1;
    }

    private static int readUint16BE(byte[] data, int off) {
        return ((data[off] & 0xFF) << 8) | (data[off + 1] & 0xFF);
    }

    private static long readUint32BE(byte[] data, int off) {
        return ((long) (data[off] & 0xFF) << 24)
                | ((long) (data[off + 1] & 0xFF) << 16)
                | ((long) (data[off + 2] & 0xFF) << 8)
                | ((long) (data[off + 3] & 0xFF));
    }

    private static int readUint32BEAsInt(byte[] data, int off) {
        return (int) readUint32BE(data, off);
    }

    /**
     * 解析结果：帧列表 + 新的解析偏移。
     */
    public record ParseResult(List<Be21Packet> packets, int newOffset) {
    }
}
