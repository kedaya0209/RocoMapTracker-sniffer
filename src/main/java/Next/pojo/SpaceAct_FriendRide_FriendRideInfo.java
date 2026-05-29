// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_FriendRide_FriendRideInfo(
    int uin,
    int gid,
    byte[] name
) {
    public static SpaceAct_FriendRide_FriendRideInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_FriendRide_FriendRideInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static SpaceAct_FriendRide_FriendRideInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_FriendRide_FriendRideInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
