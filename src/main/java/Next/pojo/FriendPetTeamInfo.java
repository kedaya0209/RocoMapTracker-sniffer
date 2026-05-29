// Generated from com_pet_team.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FriendPetTeamInfo(
    List<PetData> pets,
    List<PetTeam> teams,
    String friendName,
    int friendUin,
    int friendLevel,
    int friendCardIconSelected,
    boolean friendIsMirrorUnlocked
) {
    public static FriendPetTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FriendPetTeamInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTeam::parseFrom).toList(),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7)
        );
    }
    public static FriendPetTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FriendPetTeamInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTeam::parseFrom).toList(),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7)
        );
    }
}
