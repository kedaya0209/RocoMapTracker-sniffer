// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ShareAuraInfo(
    boolean isVisiblePlanShare,
    int srcAvatarUin,
    long srcAuraId,
    int reason
) {
    public static ShareAuraInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ShareAuraInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static ShareAuraInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ShareAuraInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
