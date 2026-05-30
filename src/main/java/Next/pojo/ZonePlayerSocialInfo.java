// Generated from com_player_social_info.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerSocialInfo(
    PlayerSocialAccountInfo accountInfo,
    PlayerSocialBaseInfo baseInfo,
    PlayerSocialOnlineInfo onlineInfo,
    PlayerSocialCardInfo cardInfo,
    PlayerSocialHomeInfo homeInfo,
    PlayerSocialBattleInfo battleInfo,
    PlayerSocialAdditionalInfo additionalInfo
) {
    public static ZonePlayerSocialInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerSocialInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerSocialAccountInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSocialBaseInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSocialOnlineInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 31) != null ? Next.pojo.PlayerSocialCardInfo.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readMessage(fields, 32) != null ? Next.pojo.PlayerSocialHomeInfo.parseFrom(Pojos.readMessage(fields, 32)) : null,
            Pojos.readMessage(fields, 33) != null ? Next.pojo.PlayerSocialBattleInfo.parseFrom(Pojos.readMessage(fields, 33)) : null,
            Pojos.readMessage(fields, 34) != null ? Next.pojo.PlayerSocialAdditionalInfo.parseFrom(Pojos.readMessage(fields, 34)) : null
        );
    }
    public static ZonePlayerSocialInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerSocialInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerSocialAccountInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSocialBaseInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSocialOnlineInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 31) != null ? Next.pojo.PlayerSocialCardInfo.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readMessage(fields, 32) != null ? Next.pojo.PlayerSocialHomeInfo.parseFrom(Pojos.readMessage(fields, 32)) : null,
            Pojos.readMessage(fields, 33) != null ? Next.pojo.PlayerSocialBattleInfo.parseFrom(Pojos.readMessage(fields, 33)) : null,
            Pojos.readMessage(fields, 34) != null ? Next.pojo.PlayerSocialAdditionalInfo.parseFrom(Pojos.readMessage(fields, 34)) : null
        );
    }
}
