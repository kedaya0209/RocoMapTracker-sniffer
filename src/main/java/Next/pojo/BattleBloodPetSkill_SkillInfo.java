// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleBloodPetSkill_SkillInfo(
    int skillId,
    boolean hide
) {
    public static BattleBloodPetSkill_SkillInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleBloodPetSkill_SkillInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static BattleBloodPetSkill_SkillInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleBloodPetSkill_SkillInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
