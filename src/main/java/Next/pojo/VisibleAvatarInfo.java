// Generated from com_avatar.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record VisibleAvatarInfo(
    int uin,
    byte[] name,
    int creditScore,
    int relation
) {
    public static VisibleAvatarInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisibleAvatarInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static VisibleAvatarInfo parseFrom(java.util.List<ProtoField> fields) {
        return new VisibleAvatarInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
