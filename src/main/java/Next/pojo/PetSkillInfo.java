// Generated from com_pet_skill.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetSkillInfo(
    List<PetSkillData> skillData,
    List<Integer> happySkillIds,
    List<Integer> angrySkillIds
) {
    public static PetSkillInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetSkillInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetSkillData::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static PetSkillInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetSkillInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetSkillData::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
