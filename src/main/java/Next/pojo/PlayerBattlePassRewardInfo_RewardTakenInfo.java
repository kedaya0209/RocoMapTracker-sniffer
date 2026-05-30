// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBattlePassRewardInfo_RewardTakenInfo(
    boolean isFreeRewardTaken,
    boolean isPaidRewardTaken,
    int bpLevel
) {
    public static PlayerBattlePassRewardInfo_RewardTakenInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattlePassRewardInfo_RewardTakenInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerBattlePassRewardInfo_RewardTakenInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattlePassRewardInfo_RewardTakenInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
