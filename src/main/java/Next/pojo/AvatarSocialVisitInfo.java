// Generated from com_player_social_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AvatarSocialVisitInfo(
    int visitorNum
) {
    public static AvatarSocialVisitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarSocialVisitInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static AvatarSocialVisitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarSocialVisitInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
