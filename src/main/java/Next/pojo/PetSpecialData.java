// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetSpecialData(
    int petConfId,
    int monsterConfId,
    String petName,
    int bloodId,
    int natureId,
    int gender,
    int height,
    int weight,
    int mutationType,
    int hpTalent,
    int phyAttackTalent,
    int speAttackTalent,
    int phyDefenseTalent,
    int speDefenseTalent,
    int speedTalent,
    int ballId,
    int glassType,
    int glassValue,
    int specialityId,
    List<Integer> medalConfIds,
    List<PetSkillData> skillData,
    int baseId,
    int voice,
    int petNameSrc
) {
    public static PetSpecialData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetSpecialData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readIntList(fields, 20),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.PetSkillData::parseFrom).toList(),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24, 0)
        );
    }
    public static PetSpecialData parseFrom(java.util.List<ProtoField> fields) {
        return new PetSpecialData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readIntList(fields, 20),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.PetSkillData::parseFrom).toList(),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24, 0)
        );
    }
}
