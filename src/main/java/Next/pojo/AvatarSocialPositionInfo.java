// Generated from com_player_social_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AvatarSocialPositionInfo(
    int displayType,
    int sceneResCfgId,
    int campId
) {
    public static AvatarSocialPositionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarSocialPositionInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static AvatarSocialPositionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarSocialPositionInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
