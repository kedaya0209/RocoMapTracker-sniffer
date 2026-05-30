// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo(
    List<PlayerActivityInfo_ActivityData> activityData,
    int lastEnterSceneTimestamp,
    int loginDays,
    int loginSeconds,
    int loginSingleSeconds,
    int lostDays,
    int lastRecordLoginDayTimestamp,
    int npcChallengePerfectLevelNumber,
    int bossChallengePerfectLevelNumber,
    List<PlayerActivityInfo_ActivityWeeklyChallengeTeam> photos,
    PlayerActivityLoginHistory loginHistory
) {
    public static PlayerActivityInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerActivityInfo_ActivityData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerActivityLoginHistory.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
    public static PlayerActivityInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerActivityInfo_ActivityData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerActivityLoginHistory.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
}
