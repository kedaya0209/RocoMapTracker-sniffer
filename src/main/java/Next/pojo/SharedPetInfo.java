// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SharedPetInfo(
    int hpTalent,
    int attackTalent,
    int specialAttackTalent,
    int defenseTalent,
    int specialDefenseTalent,
    int speedTalent,
    int baseConfId,
    int nature,
    int bloodId,
    List<PetSkillEquipInfo> skills,
    int changedNaturePosAttrType,
    int changedNatureNegAttrType
) {
    public static SharedPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SharedPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PetSkillEquipInfo::parseFrom).toList(),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static SharedPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SharedPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PetSkillEquipInfo::parseFrom).toList(),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
