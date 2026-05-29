package com.roco.sniffer.codec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.jcip.annotations.ThreadSafe;

/**
 * 轻量 protobuf wire-format 解析器。
 * <p>
 * 不依赖 .proto 生成代码，直接解析 varint / length-delimited 字段树。
 * 对应 Python: rkpp_proto_core.py parse_proto_message()
 */
@ThreadSafe
public class ProtoParser {

    private ProtoParser() {}

    // ── 解析入口 ──

    /**
     * 解析 protobuf 明文为字段列表。
     */
    public static List<ProtoField> parse(byte[] data) {
        List<ProtoField> fields = new ArrayList<>();
        if (data == null) return fields;
        int pos = 0;
        while (pos < data.length) {
            // 读 tag (varint)
            int tagStart = pos;
            long tag = 0;
            int shift = 0;
            while (pos < data.length) {
                int b = data[pos++] & 0xFF;
                tag |= (long) (b & 0x7F) << shift;
                shift += 7;
                if ((b & 0x80) == 0) break;
                if (shift > 35) break; // malformed
            }
            int fieldNo = (int) (tag >>> 3);
            int wireType = (int) (tag & 0x7);
            if (fieldNo <= 0) break;

            switch (wireType) {
                case 0 -> { // varint
                    long val = 0;
                    int vs = 0;
                    while (pos < data.length) {
                        int b = data[pos++] & 0xFF;
                        val |= (long) (b & 0x7F) << vs;
                        vs += 7;
                        if ((b & 0x80) == 0) break;
                        if (vs > 63) break;
                    }
                    fields.add(new ProtoField(fieldNo, wireType, val, null, null));
                }
                case 1 -> { // 64-bit
                    if (pos + 8 > data.length) return fields;
                    pos += 8;
                    fields.add(new ProtoField(fieldNo, wireType, 0, null, null));
                }
                case 2 -> { // length-delimited
                    int lenStart = pos;
                    int len = 0;
                    int ls = 0;
                    while (pos < data.length) {
                        int b = data[pos++] & 0xFF;
                        len |= (b & 0x7F) << ls;
                        ls += 7;
                        if ((b & 0x80) == 0) break;
                        if (ls > 28) break;
                    }
                    if (pos + len > data.length) return fields;
                    byte[] raw = Arrays.copyOfRange(data, pos, pos + len);
                    pos += len;
                    // 尝试递归解析为子消息
                    List<ProtoField> sub = parse(raw);
                    if (!sub.isEmpty() && sub.stream().allMatch(f -> f.fieldNo > 0 && f.fieldNo < 10000)) {
                        fields.add(new ProtoField(fieldNo, wireType, 0, sub, null));
                    } else {
                        fields.add(new ProtoField(fieldNo, wireType, 0, null, raw));
                    }
                }
                case 5 -> { // 32-bit
                    if (pos + 4 > data.length) return fields;
                    pos += 4;
                    fields.add(new ProtoField(fieldNo, wireType, 0, null, null));
                }
                default -> { return fields; } // 未知 wire type，停止解析
            }
        }
        return fields;
    }

    // ── 传输层解析 ──

    private static final byte[] MAGIC_S2C = {0x55, (byte) 0xAA};
    private static final byte[] MAGIC_C2S_1 = {0x39, 0x63};
    private static final byte[] MAGIC_C2S_2 = {0x7C, (byte) 0xA2};

    /**
     * 从解密后的 0x4013 body 中解析传输层 record，与 Python parse_record() 对齐。
     * <p>
     * 按优先级尝试 5 种传输布局：
     * <ol>
     *   <li>tgcp_4013_v14 — magic 0x55AA + 0x3963</li>
     *   <li>tgcp_4013_live_s2c — magic 0x55AA, s2c</li>
     *   <li>tgcp_4013_live_c2s — magic 0x3963, c2s</li>
     *   <li>tgcp_4013_live_c2s_alt_7ca2 — magic 0x7CA2, c2s</li>
     *   <li>tgcp_4013_live_c2s_short_heartbeat — 心跳帧 0x013E</li>
     * </ol>
     *
     * @param body      解密后的 0x4013 body
     * @param direction 方向
     * @return 解析结果，无法识别时返回 null
     */
    public static Record parseRecord(byte[] body, Direction direction) {
        if (body == null) return null;
        Record r;
        r = parseRecordV14(body, direction);
        if (r != null) return r;
        r = parseRecordLiveS2c(body, direction);
        if (r != null) return r;
        r = parseRecordLiveC2s(body, direction);
        if (r != null) return r;
        r = parseRecordLiveC2sAlt7ca2(body, direction);
        if (r != null) return r;
        r = parseRecordLiveC2sShortHeartbeat(body, direction);
        if (r != null) return r;
        return null;
    }

    /**
     * v14 布局: body[4:6]==0x55AA && body[24:26]==0x3963, payload 从 body[30:] 开始。
     */
    private static Record parseRecordV14(byte[] body, Direction direction) {
        if (body.length < 0x1E) return null;
        if (body[4] != MAGIC_S2C[0] || body[5] != MAGIC_S2C[1]) return null;
        if (body[24] != MAGIC_C2S_1[0] || body[25] != MAGIC_C2S_1[1]) return null;

        long transportSeq = readUint32BE(body, 0);
        long recordLen = readUint32BE(body, 6);
        int reserved = readUint16BE(body, 10);
        long version = readUint32BE(body, 12);
        long sessionId = readUint32BE(body, 16);
        long subId = readUint32BE(body, 20);
        long reqSeq = readUint32BE(body, 26);

        byte[] rawPayload = Arrays.copyOfRange(body, 30, body.length);
        int trailerLen = tsf4gTrailerLen(rawPayload);
        int noTrailerLen = body.length - trailerLen;

        if (reserved != 0 || (version != 0 && version != 1) || recordLen != noTrailerLen - 4) {
            return null;
        }

        byte[] payload = stripTsf4gPadding(rawPayload);
        int opcode;
        boolean normalized;
        if (direction == Direction.C2S) {
            opcode = normalizeC2sOpcode((int) subId);
            normalized = (subId > 0xFFFF);
        } else {
            opcode = (int) (sessionId & 0xFFFF);
            normalized = false;
        }

        List<ProtoField> fields = parse(payload);
        return new Record("tgcp_4013_v14", direction, opcode, payload, fields,
                transportSeq, reqSeq, trailerLen);
    }

    /**
     * live_s2c 布局: s2c, body[4:6]==0x55AA, opcode 在 body[0:4], payload 从 body[10:] 开始。
     */
    private static Record parseRecordLiveS2c(byte[] body, Direction direction) {
        if (direction != Direction.S2C || body.length < 10) return null;
        if (body[4] != MAGIC_S2C[0] || body[5] != MAGIC_S2C[1]) return null;

        int opcode = (int) readUint32BE(body, 0);
        if (opcode <= 0 || opcode > 0xFFFF) return null;

        byte[] rawPayload = Arrays.copyOfRange(body, 10, body.length);
        int trailerLen = tsf4gTrailerLen(rawPayload);
        byte[] payload = stripTsf4gPadding(rawPayload);
        List<ProtoField> fields = parse(payload);
        return new Record("tgcp_4013_live_s2c", direction, opcode, payload, fields,
                0, 0, trailerLen);
    }

    /**
     * live_c2s 布局: c2s, body[8:10]==0x3963, raw_opcode 在 body[4:8], payload 从 body[14:] 开始。
     */
    private static Record parseRecordLiveC2s(byte[] body, Direction direction) {
        if (direction != Direction.C2S || body.length < 14) return null;
        if (body[8] != MAGIC_C2S_1[0] || body[9] != MAGIC_C2S_1[1]) return null;

        long prefixU32 = readUint32BE(body, 0);
        int rawOpcode = (int) readUint32BE(body, 4);
        if (!isProbableLiveC2sRawOpcode(rawOpcode)) return null;

        int opcode = normalizeC2sOpcode(rawOpcode);
        long reqSeq = readUint32BE(body, 10);

        byte[] rawPayload = Arrays.copyOfRange(body, 14, body.length);
        int trailerLen = tsf4gTrailerLen(rawPayload);
        byte[] payload = stripTsf4gPadding(rawPayload);
        List<ProtoField> fields = parse(payload);
        return new Record("tgcp_4013_live_c2s", direction, opcode, payload, fields,
                prefixU32, reqSeq, trailerLen);
    }

    /**
     * live_c2s_alt_7ca2 布局: c2s, body[8:10]==0x7CA2, payload 从 body[14:] 开始。
     */
    private static Record parseRecordLiveC2sAlt7ca2(byte[] body, Direction direction) {
        if (direction != Direction.C2S || body.length < 14) return null;
        if (body[8] != MAGIC_C2S_2[0] || body[9] != MAGIC_C2S_2[1]) return null;

        long prefixU32 = readUint32BE(body, 0);
        int rawOpcode = (int) readUint32BE(body, 4);
        if (!isProbableLiveC2sRawOpcode(rawOpcode)) return null;

        int opcode = normalizeC2sOpcode(rawOpcode);
        long reqSeq = readUint32BE(body, 10);

        byte[] rawPayload = Arrays.copyOfRange(body, 14, body.length);
        int trailerLen = tsf4gTrailerLen(rawPayload);
        byte[] payload = stripTsf4gPadding(rawPayload);
        List<ProtoField> fields = parse(payload);
        return new Record("tgcp_4013_live_c2s_alt_7ca2", direction, opcode, payload, fields,
                prefixU32, reqSeq, trailerLen);
    }

    /**
     * short_heartbeat 布局: c2s, body 含 "tsf4g", opcode=0x013E。
     */
    private static Record parseRecordLiveC2sShortHeartbeat(byte[] body, Direction direction) {
        if (direction != Direction.C2S || body.length < 16) return null;
        if (indexOf(body, "tsf4g".getBytes()) < 8) return null;

        int opcode = readUint16BE(body, 6);
        if (opcode != 0x013E) return null;

        long leadingU32 = readUint32BE(body, 0);
        return new Record("tgcp_4013_live_c2s_short_heartbeat", direction, opcode,
                new byte[0], List.of(), leadingU32, 0, 0);
    }

    private static boolean isProbableLiveC2sRawOpcode(int rawOpcode) {
        if (rawOpcode <= 0) return false;
        int high = rawOpcode >>> 16;
        int low = rawOpcode & 0xFFFF;
        return (high == 0 || high == 1) && low != 0;
    }

    private static int normalizeC2sOpcode(int rawOpcode) {
        if (rawOpcode > 0xFFFF && (rawOpcode >>> 16) == 0x0001) {
            int low = rawOpcode & 0xFFFF;
            if (low != 0) return low;
        }
        return rawOpcode;
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

    private static int indexOf(byte[] data, byte[] pattern) {
        outer:
        for (int i = 0; i <= data.length - pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (data[i + j] != pattern[j]) continue outer;
            }
            return i;
        }
        return -1;
    }

    // ── TSF4G 尾部处理 ──

    /**
     * 计算可识别的 TSF4G 尾部长度；无尾部时返回 0。
     */
    private static int tsf4gTrailerLen(byte[] data) {
        byte[] marker = "tsf4g".getBytes();
        int markerPos = data.length - 6;
        if (markerPos < 0) return 0;
        // 检查尾部是否为 "tsf4g"
        for (int i = 0; i < 5; i++) {
            if (data[markerPos + i] != marker[i]) return 0;
        }
        int pad = data[data.length - 1] & 0xFF;
        if (5 + 1 <= pad && pad <= 64 && data.length >= pad) return pad;
        if (pad == 1) return 1;
        if (pad > 0 && pad <= 16 && data.length >= pad) {
            boolean allSame = true;
            for (int i = data.length - pad; i < data.length; i++) {
                if ((data[i] & 0xFF) != pad) { allSame = false; break; }
            }
            if (allSame) return pad;
        }
        return 0;
    }

    /**
     * 移除腾讯 TSF4G 协议的尾部填充。
     */
    private static byte[] stripTsf4gPadding(byte[] data) {
        if (data == null || data.length < 6) return data;
        byte[] marker = "tsf4g".getBytes();
        int markerPos = data.length - 6;
        // 检查尾部是否为 "tsf4g"
        for (int i = 0; i < 5; i++) {
            if (data[markerPos + i] != marker[i]) return data;
        }
        int pad = data[data.length - 1] & 0xFF;
        if (5 + 1 <= pad && pad <= 64 && data.length >= pad) {
            return Arrays.copyOfRange(data, 0, data.length - pad);
        }
        if (pad == 1) {
            return Arrays.copyOfRange(data, 0, data.length - 1);
        }
        if (pad > 0 && pad <= 16 && data.length >= pad) {
            boolean allSame = true;
            for (int i = data.length - pad; i < data.length; i++) {
                if ((data[i] & 0xFF) != pad) { allSame = false; break; }
            }
            if (allSame) return Arrays.copyOfRange(data, 0, data.length - pad);
        }
        return data;
    }

    /**
     * 传输层 record 解析结果。
     *
     * @param layout     传输布局名称
     * @param direction  方向
     * @param opcode     消息 opcode
     * @param payload    去除传输层头 + TSF4G 尾部后的 protobuf payload
     * @param fields     payload 的 protobuf 字段树
     * @param seq        传输层序列号 (transport_seq / prefix_u32)
     * @param reqSeq     请求序列号
     * @param trailerLen TSF4G 尾部长度
     */
    public record Record(String layout, Direction direction, int opcode,
                         byte[] payload, List<ProtoField> fields,
                         long seq, long reqSeq, int trailerLen) {
    }

    // ── 字段数据类 ──

    public static class ProtoField {
        public final int fieldNo;
        public final int wireType;
        public final long varintVal;
        public final List<ProtoField> subFields;
        public final byte[] bytesVal;

        ProtoField(int fieldNo, int wireType, long varintVal, List<ProtoField> subFields, byte[] bytesVal) {
            this.fieldNo = fieldNo;
            this.wireType = wireType;
            this.varintVal = varintVal;
            this.subFields = subFields;
            this.bytesVal = bytesVal;
        }
    }
}
