// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WorldLeaderFight(
    int npcHp,
    int npcHpMax,
    int stunBuffRemainTime,
    List<Integer> gainExpose,
    int npcLowestHp,
    int round,
    int visitorNum,
    int worldOwnerLevel,
    int worldOwnerWorldLv,
    int curGainExpose,
    List<BattleFinishPetInfo> finishPetInfos
) {
    public static WorldLeaderFight parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldLeaderFight(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10, 0),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.BattleFinishPetInfo::parseFrom).toList()
        );
    }
    public static WorldLeaderFight parseFrom(java.util.List<ProtoField> fields) {
        return new WorldLeaderFight(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10, 0),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.BattleFinishPetInfo::parseFrom).toList()
        );
    }
}
