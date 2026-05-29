// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AdjustedPetTeamInfo(
    List<AdjustedPet> pets
) {
    public static AdjustedPetTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AdjustedPetTeamInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AdjustedPet::parseFrom).toList()
        );
    }
    public static AdjustedPetTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AdjustedPetTeamInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AdjustedPet::parseFrom).toList()
        );
    }
}
