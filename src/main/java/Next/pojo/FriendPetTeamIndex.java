// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FriendPetTeamIndex(
    String indexString
) {
    public static FriendPetTeamIndex parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FriendPetTeamIndex(
            Pojos.readString(fields, 1)
        );
    }
    public static FriendPetTeamIndex parseFrom(java.util.List<ProtoField> fields) {
        return new FriendPetTeamIndex(
            Pojos.readString(fields, 1)
        );
    }
}
