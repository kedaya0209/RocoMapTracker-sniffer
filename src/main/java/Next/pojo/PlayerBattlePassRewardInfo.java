// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBattlePassRewardInfo(
    List<PlayerBattlePassRewardInfo_RewardTakenInfo> rewardTakenInfo
) {
    public static PlayerBattlePassRewardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattlePassRewardInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBattlePassRewardInfo_RewardTakenInfo::parseFrom).toList()
        );
    }
    public static PlayerBattlePassRewardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattlePassRewardInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBattlePassRewardInfo_RewardTakenInfo::parseFrom).toList()
        );
    }
}
