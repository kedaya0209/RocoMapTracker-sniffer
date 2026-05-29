// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AvatarVisibility(
    long avatarUin,
    boolean visibility,
    int recoveryTime
) {
    public static AvatarVisibility parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarVisibility(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static AvatarVisibility parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarVisibility(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
