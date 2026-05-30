// Generated from com_player_social_info.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSocialInfo(
    ZonePlayerSocialInfo playerSocial,
    AvatarSocialInfo avatarSocial,
    int lastUpdateTime
) {
    public static PlayerSocialInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSocialInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ZonePlayerSocialInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AvatarSocialInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerSocialInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSocialInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ZonePlayerSocialInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AvatarSocialInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
}
