// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityTerritoryTrialData(
    int baseId,
    PlayerActivityInfo_TerritoryTrialInfo trialInfo,
    List<PlayerActivityInfo_ChallengeReward> rewards
) {
    public static PlayerActivityInfo_ActivityTerritoryTrialData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityTerritoryTrialData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_TerritoryTrialInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityTerritoryTrialData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityTerritoryTrialData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_TerritoryTrialInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeReward::parseFrom).toList()
        );
    }
}
