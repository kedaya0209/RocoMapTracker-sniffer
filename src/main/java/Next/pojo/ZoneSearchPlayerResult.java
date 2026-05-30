// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSearchPlayerResult(
    String openid,
    FriendRoleInfo playerInfo,
    boolean isFriend,
    boolean isBlackRole,
    int searchRet
) {
    public static ZoneSearchPlayerResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSearchPlayerResult(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneSearchPlayerResult parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSearchPlayerResult(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
