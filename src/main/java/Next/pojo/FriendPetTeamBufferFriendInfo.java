// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FriendPetTeamBufferFriendInfo(
    byte[] name,
    int level,
    int cardIconSelected
) {
    public static FriendPetTeamBufferFriendInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FriendPetTeamBufferFriendInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static FriendPetTeamBufferFriendInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FriendPetTeamBufferFriendInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
