// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendDataChangedNotify(
    int action,
    FriendRoleInfo friendData
) {
    public static ZoneFriendDataChangedNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendDataChangedNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneFriendDataChangedNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendDataChangedNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
