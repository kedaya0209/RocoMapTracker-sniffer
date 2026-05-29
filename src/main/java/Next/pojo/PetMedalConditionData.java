// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetMedalConditionData(
    List<KillPetRoundData> killPetRoundList,
    int castSkillCount,
    List<Integer> killPetRoleHpList,
    int continuousCounterCount,
    int continuousNoCounterCount,
    int continuousRestraintCount,
    int continuousResistCount,
    int killPetUpEvo,
    int killPetSameEvo,
    List<Integer> killedEvolutionChains,
    int winEnergy,
    int winHpPercent,
    boolean winWithInverseRestraint,
    int winCasterRoleHp,
    int winEnemyRoleHp,
    boolean winInBattle,
    int continuousCounterCurCount,
    int continuousNoCounterCurCount,
    int continuousRestraintCurCount,
    int continuousResistCurCount
) {
    public static PetMedalConditionData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalConditionData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.KillPetRoundData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20)
        );
    }
    public static PetMedalConditionData parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalConditionData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.KillPetRoundData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20)
        );
    }
}
