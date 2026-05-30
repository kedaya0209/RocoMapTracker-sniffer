// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Rider(
    int isRiding,
    int ridePetGid,
    long addedRideBuffId,
    int ridePetBaseId,
    int rideFriendPetGid,
    int rideFriendUin,
    List<FriendRideData> friendRideDatas
) {
    public static ActorCompData_Rider parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Rider(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 101),
            Pojos.readInt(fields, 102),
            Pojos.readMessageList(fields, 105).stream().map(Next.pojo.FriendRideData::parseFrom).toList()
        );
    }
    public static ActorCompData_Rider parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Rider(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 101),
            Pojos.readInt(fields, 102),
            Pojos.readMessageList(fields, 105).stream().map(Next.pojo.FriendRideData::parseFrom).toList()
        );
    }
}
