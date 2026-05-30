// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBattleData_SceneSettleInfo(
    int catchPetCnt,
    List<PlayerBattleData_RewardNpcInfo> npcInfo
) {
    public static PlayerBattleData_SceneSettleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattleData_SceneSettleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBattleData_RewardNpcInfo::parseFrom).toList()
        );
    }
    public static PlayerBattleData_SceneSettleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattleData_SceneSettleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBattleData_RewardNpcInfo::parseFrom).toList()
        );
    }
}
