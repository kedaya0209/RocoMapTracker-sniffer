// Generated from com_player_settings.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSettings(
    ObserveBattle observeBattle,
    PlayerSettings_Friendship friendship,
    int quality,
    boolean isHideUnlockSkill,
    PlayerSettings_UserSubscribe userSubsribe,
    PlayerSettings_Pvp pvp,
    PlayerSettings_PersonalizedRecommendations recommendations
) {
    public static PlayerSettings parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSettings(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ObserveBattle.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSettings_Friendship.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerSettings_UserSubscribe.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerSettings_Pvp.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerSettings_PersonalizedRecommendations.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
    public static PlayerSettings parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSettings(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ObserveBattle.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSettings_Friendship.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerSettings_UserSubscribe.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerSettings_Pvp.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerSettings_PersonalizedRecommendations.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
}
