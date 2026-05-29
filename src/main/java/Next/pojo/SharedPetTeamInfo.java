// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SharedPetTeamInfo(
    String teamName,
    int teamType,
    int roleMagicId,
    List<SharedPetInfo> pets
) {
    public static SharedPetTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SharedPetTeamInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SharedPetInfo::parseFrom).toList()
        );
    }
    public static SharedPetTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SharedPetTeamInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SharedPetInfo::parseFrom).toList()
        );
    }
}
