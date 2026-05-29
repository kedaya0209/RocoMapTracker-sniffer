// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendAddOrRemoveFriendNotify(
    int uin,
    int operType,
    FriendRoleInfo changeFriendRole,
    FriendRequestInfo newReqFriend
) {
    public static ZoneFriendAddOrRemoveFriendNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendAddOrRemoveFriendNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FriendRequestInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneFriendAddOrRemoveFriendNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendAddOrRemoveFriendNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FriendRequestInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
