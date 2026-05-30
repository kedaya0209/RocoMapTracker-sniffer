// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleSkillSyncInfo(
    int petId,
    int skillId,
    int damageParamChange,
    int damageParamResult,
    int damageParamPetId,
    int castCntChange,
    int castCntResult,
    int ppChange,
    int ppResult,
    int costEnergyChange,
    int costEnergyResult,
    int costHpChange,
    int costHpResult,
    boolean displayHpResult,
    int spEnergySkill,
    float hpPerEnergy,
    int state,
    int damageType
) {
    public static BattleSkillSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSkillSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readFloat(fields, 15),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
    public static BattleSkillSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSkillSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readFloat(fields, 15),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
}
