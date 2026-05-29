// Generated from com_pet_skill.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetSkillRecord(
    int skillId,
    int useTimes
) {
    public static PetSkillRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetSkillRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PetSkillRecord parseFrom(java.util.List<ProtoField> fields) {
        return new PetSkillRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
