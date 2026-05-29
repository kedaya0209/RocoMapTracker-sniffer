// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AvatarStatusDataWalking(
    int type
) {
    public static AvatarStatusDataWalking parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarStatusDataWalking(
            Pojos.readInt(fields, 1)
        );
    }
    public static AvatarStatusDataWalking parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarStatusDataWalking(
            Pojos.readInt(fields, 1)
        );
    }
}
