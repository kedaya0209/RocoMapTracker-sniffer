// Generated from com_player_social_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AvatarSocialInfo(
    AvatarSocialPositionInfo posInfo,
    AvatarSocialVisitInfo visitInfo,
    AvatarSocialAdditionalInfo additionalInfo
) {
    public static AvatarSocialInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarSocialInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.AvatarSocialPositionInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AvatarSocialVisitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AvatarSocialAdditionalInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static AvatarSocialInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarSocialInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.AvatarSocialPositionInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AvatarSocialVisitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AvatarSocialAdditionalInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
