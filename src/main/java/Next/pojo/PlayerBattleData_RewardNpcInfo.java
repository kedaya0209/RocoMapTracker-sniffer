// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBattleData_RewardNpcInfo(
    int npcConfId,
    int npcNum
) {
    public static PlayerBattleData_RewardNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattleData_RewardNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerBattleData_RewardNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattleData_RewardNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
