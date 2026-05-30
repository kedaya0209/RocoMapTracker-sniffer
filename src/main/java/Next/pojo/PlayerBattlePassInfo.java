// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBattlePassInfo(
    int battlePassId,
    int themeId,
    PlayerBattlePassExpInfo expInfo,
    PlayerBattlePassRewardInfo rewardInfo,
    PlayerBattlePassTaskInfo taskInfo,
    List<Integer> boughtGiftSubBagItemIds
) {
    public static PlayerBattlePassInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattlePassInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerBattlePassExpInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerBattlePassRewardInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerBattlePassTaskInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readIntList(fields, 9)
        );
    }
    public static PlayerBattlePassInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattlePassInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerBattlePassExpInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerBattlePassRewardInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerBattlePassTaskInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readIntList(fields, 9)
        );
    }
}
