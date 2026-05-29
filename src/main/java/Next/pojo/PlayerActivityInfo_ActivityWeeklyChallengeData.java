// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityWeeklyChallengeData(
    int eventId,
    PlayerActivityInfo_ActivityWeeklyChallengeInfo challengeInfo,
    List<PlayerActivityInfo_ChallengeReward> rewards,
    List<PlayerActivityInfo_ChallengePetUseRate> petUseRate,
    List<PlayerActivityInfo_ActivityWeeklyChallengeTeam> petTeams,
    PlayerActivityInfo_ActivityWeeklyChallengeTeam teamPhoto,
    int photoCheerPointRequired,
    List<PlayerActivityInfo_WeeklyChallengeEquipSkill> equipSkills
) {
    public static PlayerActivityInfo_ActivityWeeklyChallengeData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityWeeklyChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerActivityInfo_ChallengePetUseRate::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerActivityInfo_WeeklyChallengeEquipSkill::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityWeeklyChallengeData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityWeeklyChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerActivityInfo_ChallengePetUseRate::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerActivityInfo_WeeklyChallengeEquipSkill::parseFrom).toList()
        );
    }
}
