// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BossWorldCombatInfo(
    int worldCombatId,
    List<Long> combatAvatarList,
    int subStatus,
    int externalCombatPhase,
    List<String> weaknessPosList,
    List<Integer> weaknessTypeList,
    String hitWeaknessPos,
    long barrierBuffId,
    long weaknessBuffId,
    long stunBuffId,
    int beginInternalBattleHp,
    List<BattleBuffBrefInfo> battleBuffInfos,
    List<String> gainPosList,
    List<Integer> gainTypeList,
    long gainExposeBuffId,
    List<Integer> usedGainType,
    int npcLowestHp,
    List<Long> boxRefreshedAvatarList,
    List<BattleFinishPetInfo> finishPetInfos
) {
    public static BossWorldCombatInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BossWorldCombatInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLongList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readStringList(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList(),
            Pojos.readStringList(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readLong(fields, 16),
            Pojos.readIntList(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readLongList(fields, 19),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.BattleFinishPetInfo::parseFrom).toList()
        );
    }
    public static BossWorldCombatInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BossWorldCombatInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLongList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readStringList(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList(),
            Pojos.readStringList(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readLong(fields, 16),
            Pojos.readIntList(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readLongList(fields, 19),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.BattleFinishPetInfo::parseFrom).toList()
        );
    }
}
