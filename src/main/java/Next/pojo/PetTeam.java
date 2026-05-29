// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetTeam(
    List<PetTeam_PetInfo> petInfos,
    String teamName,
    int roleMagicGid,
    TrialPetBrief trialPet,
    boolean isMirror,
    String mirrorFriendName,
    int teamIdx,
    int mirrorFriendUin,
    int mirrorFriendCardIconSelected,
    int mirrorMagicId
) {
    public static PetTeam parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTeam(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTeam_PetInfo::parseFrom).toList(),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.TrialPetBrief.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readBool(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static PetTeam parseFrom(java.util.List<ProtoField> fields) {
        return new PetTeam(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTeam_PetInfo::parseFrom).toList(),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.TrialPetBrief.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readBool(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
