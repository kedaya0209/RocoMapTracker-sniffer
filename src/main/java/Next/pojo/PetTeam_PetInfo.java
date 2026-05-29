// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetTeam_PetInfo(
    int petGid,
    List<PetSkillEquipInfo> equipInfos,
    boolean isTrialPet,
    PetTypeInfo type
) {
    public static PetTeam_PetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTeam_PetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetSkillEquipInfo::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static PetTeam_PetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetTeam_PetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetSkillEquipInfo::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
