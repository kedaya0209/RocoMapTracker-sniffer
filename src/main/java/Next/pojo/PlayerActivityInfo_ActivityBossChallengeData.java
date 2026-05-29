// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityBossChallengeData(
    int eventId,
    List<PlayerActivityInfo_ChallengeLevel> levels,
    List<PlayerActivityInfo_ChallengeReward> rewards,
    int buffRuleId,
    int perfectLevelNumber,
    int lastLevelId,
    List<PlayerActivityInfo_ChallengePetUseRate> petUseRate,
    int battleRound,
    int weaknessAttackCount,
    List<Integer> enterBattlePetGids
) {
    public static PlayerActivityInfo_ActivityBossChallengeData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityBossChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ChallengeLevel::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerActivityInfo_ChallengePetUseRate::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10)
        );
    }
    public static PlayerActivityInfo_ActivityBossChallengeData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityBossChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ChallengeLevel::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerActivityInfo_ChallengePetUseRate::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10)
        );
    }
}
