package io.github.kedaya0209.roco.sniffer.codec;

import java.util.ArrayList;
import java.util.List;

import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;

/**
 * POJO protobuf 解析工具。
 * <p>
 * 提供从 {@link ProtoParser#parse(byte[])} 结果中读取各类字段的静态方法，
 * 供 {@code Next.pojo.*.parseFrom()} 使用。
 */
public final class Pojos {

    private Pojos() {}

    // ── 标量读取 ──

    /** 读取第一个匹配的 varint 字段并转为 int。未找到返回 0。 */
    public static int readInt(List<ProtoField> fields, int fieldNo) {
        return readInt(fields, fieldNo, 0);
    }

    /** 读取第一个匹配的 varint 字段并转为 int。未找到返回 defaultValue。 */
    public static int readInt(List<ProtoField> fields, int fieldNo, int defaultValue) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 0) {
                return (int) f.varintVal;
            }
        }
        return defaultValue;
    }

    /** 读取第一个匹配的 varint 字段并转为 long。未找到返回 0L。 */
    public static long readLong(List<ProtoField> fields, int fieldNo) {
        return readLong(fields, fieldNo, 0L);
    }

    /** 读取第一个匹配的 varint 字段并转为 long。未找到返回 defaultValue。 */
    public static long readLong(List<ProtoField> fields, int fieldNo, long defaultValue) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 0) {
                return f.varintVal;
            }
        }
        return defaultValue;
    }

    /** 读取第一个匹配的 varint 字段并转为 boolean。未找到返回 false。 */
    public static boolean readBool(List<ProtoField> fields, int fieldNo) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 0) {
                return f.varintVal != 0;
            }
        }
        return false;
    }

    /** 读取第一个匹配的 32-bit 字段并转为 float。未找到返回 0f。 */
    public static float readFloat(List<ProtoField> fields, int fieldNo) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 5) {
                return Float.intBitsToFloat((int) f.varintVal);
            }
        }
        return 0f;
    }

    /** 读取第一个匹配的 64-bit 字段并转为 double。未找到返回 0.0。 */
    public static double readDouble(List<ProtoField> fields, int fieldNo) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 1) {
                return Double.longBitsToDouble(f.varintVal);
            }
        }
        return 0.0;
    }

    // ── 字符串 / bytes ──

    /** 读取第一个匹配的 length-delimited 字段并解码为 UTF-8 字符串。未找到返回 ""。 */
    public static String readString(List<ProtoField> fields, int fieldNo) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 2 && f.bytesVal != null) {
                return new String(f.bytesVal, java.nio.charset.StandardCharsets.UTF_8);
            }
        }
        return "";
    }

    /** 读取第一个匹配的 length-delimited 字段为 byte[]。未找到返回空数组。 */
    public static byte[] readBytes(List<ProtoField> fields, int fieldNo) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 2 && f.bytesVal != null) {
                return f.bytesVal;
            }
        }
        return new byte[0];
    }

    // ── 子消息 ──

    /** 读取第一个匹配的子消息字段，返回解析后的字段列表。未找到返回 null。 */
    public static List<ProtoField> readMessage(List<ProtoField> fields, int fieldNo) {
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 2 && f.subFields != null) {
                return f.subFields;
            }
        }
        return null;
    }

    // ── 重复标量 (packed) ──

    /** 读取所有匹配的 varint 字段为 int 列表（支持 packed 和非 packed）。 */
    public static List<Integer> readIntList(List<ProtoField> fields, int fieldNo) {
        List<Integer> result = new ArrayList<>();
        for (ProtoField f : fields) {
            if (f.fieldNo != fieldNo) continue;
            if (f.wireType == 0) {
                result.add((int) f.varintVal);
            } else if (f.wireType == 2 && f.bytesVal != null) {
                // packed repeated
                result.addAll(decodePackedInts(f.bytesVal));
            }
        }
        return result;
    }

    /** 读取所有匹配的 varint 字段为 long 列表。 */
    public static List<Long> readLongList(List<ProtoField> fields, int fieldNo) {
        List<Long> result = new ArrayList<>();
        for (ProtoField f : fields) {
            if (f.fieldNo != fieldNo) continue;
            if (f.wireType == 0) {
                result.add(f.varintVal);
            } else if (f.wireType == 2 && f.bytesVal != null) {
                for (long v : decodePackedLongs(f.bytesVal)) {
                    result.add(v);
                }
            }
        }
        return result;
    }

    /** 读取所有匹配的 varint 字段为 boolean 列表。 */
    public static List<Boolean> readBoolList(List<ProtoField> fields, int fieldNo) {
        List<Boolean> result = new ArrayList<>();
        for (ProtoField f : fields) {
            if (f.fieldNo != fieldNo) continue;
            if (f.wireType == 0) {
                result.add(f.varintVal != 0);
            } else if (f.wireType == 2 && f.bytesVal != null) {
                for (long v : decodePackedLongs(f.bytesVal)) {
                    result.add(v != 0);
                }
            }
        }
        return result;
    }

    // ── 重复 string / bytes ──

    /** 读取所有匹配的 length-delimited 字段为 String 列表。 */
    public static List<String> readStringList(List<ProtoField> fields, int fieldNo) {
        List<String> result = new ArrayList<>();
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 2 && f.bytesVal != null) {
                result.add(new String(f.bytesVal, java.nio.charset.StandardCharsets.UTF_8));
            }
        }
        return result;
    }

    /** 读取所有匹配的 length-delimited 字段为 byte[] 列表。 */
    public static List<byte[]> readBytesList(List<ProtoField> fields, int fieldNo) {
        List<byte[]> result = new ArrayList<>();
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 2 && f.bytesVal != null) {
                result.add(f.bytesVal);
            }
        }
        return result;
    }

    // ── 重复子消息 ──

    /** 读取所有匹配的子消息字段，返回字段列表的列表。 */
    public static List<List<ProtoField>> readMessageList(List<ProtoField> fields, int fieldNo) {
        List<List<ProtoField>> result = new ArrayList<>();
        for (ProtoField f : fields) {
            if (f.fieldNo == fieldNo && f.wireType == 2 && f.subFields != null) {
                result.add(f.subFields);
            }
        }
        return result;
    }

    // ── packed varint 解码 ──

    private static List<Integer> decodePackedInts(byte[] data) {
        List<Integer> result = new ArrayList<>();
        int pos = 0;
        while (pos < data.length) {
            long val = 0;
            int shift = 0;
            while (pos < data.length) {
                int b = data[pos++] & 0xFF;
                val |= (long) (b & 0x7F) << shift;
                shift += 7;
                if ((b & 0x80) == 0) break;
            }
            result.add((int) val);
        }
        return result;
    }

    private static long[] decodePackedLongs(byte[] data) {
        long[] result = new long[data.length]; // upper bound
        int count = 0;
        int pos = 0;
        while (pos < data.length) {
            long val = 0;
            int shift = 0;
            while (pos < data.length) {
                int b = data[pos++] & 0xFF;
                val |= (long) (b & 0x7F) << shift;
                shift += 7;
                if ((b & 0x80) == 0) break;
            }
            result[count++] = val;
        }
        long[] trimmed = new long[count];
        System.arraycopy(result, 0, trimmed, 0, count);
        return trimmed;
    }
}
