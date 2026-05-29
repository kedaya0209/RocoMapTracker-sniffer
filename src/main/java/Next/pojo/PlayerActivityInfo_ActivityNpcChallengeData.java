// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityNpcChallengeData(
    int eventId,
    List<PlayerActivityInfo_ActivityNpcChallengeData_Module> modules,
    List<PlayerActivityInfo_ChallengeReward> rewards,
    int perfectLevelNumber,
    int lastLevelId,
    List<PlayerActivityInfo_ChallengePetUseRate> petUseRate
) {
    public static PlayerActivityInfo_ActivityNpcChallengeData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityNpcChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityNpcChallengeData_Module::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerActivityInfo_ChallengePetUseRate::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityNpcChallengeData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityNpcChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityNpcChallengeData_Module::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerActivityInfo_ChallengePetUseRate::parseFrom).toList()
        );
    }
}
