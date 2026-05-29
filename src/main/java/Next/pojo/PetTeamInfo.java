// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetTeamInfo(
    int mainTeamIdx,
    List<PetTeam> teams,
    List<PetSynchronInfo> synchron,
    int teamType
) {
    public static PetTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTeamInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTeam::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetSynchronInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4)
        );
    }
    public static PetTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetTeamInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTeam::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetSynchronInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4)
        );
    }
}
