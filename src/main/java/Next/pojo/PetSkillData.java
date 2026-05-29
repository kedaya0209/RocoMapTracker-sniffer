// Generated from com_pet_skill.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetSkillData(
    int id,
    int type,
    boolean isLearned,
    boolean isEquipped,
    int pos,
    int unlockNeedLv,
    int rawId,
    PetCarryonInfo carryonInfo,
    int confIdx,
    int skillSrc,
    int unlockNeedBaseId,
    int useTimes
) {
    public static PetSkillData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetSkillData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetCarryonInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16)
        );
    }
    public static PetSkillData parseFrom(java.util.List<ProtoField> fields) {
        return new PetSkillData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetCarryonInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16)
        );
    }
}
