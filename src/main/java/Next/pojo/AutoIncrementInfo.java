// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AutoIncrementInfo(
    int type,
    int key1,
    int key2,
    long step,
    long seq,
    boolean isMinus
) {
    public static AutoIncrementInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AutoIncrementInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
    public static AutoIncrementInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AutoIncrementInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
}
