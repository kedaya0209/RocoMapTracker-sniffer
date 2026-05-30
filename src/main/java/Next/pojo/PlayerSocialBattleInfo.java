// Generated from com_player_social_info.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSocialBattleInfo(
    int battleState,
    int battleConfId
) {
    public static PlayerSocialBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSocialBattleInfo(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 1)
        );
    }
    public static PlayerSocialBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSocialBattleInfo(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 1)
        );
    }
}
