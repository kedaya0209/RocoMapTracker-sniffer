// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendSearchPlayerRsp(
    RetInfo retInfo,
    FriendRoleInfo playerInfo,
    boolean isFriend,
    boolean isBlackRole,
    BanInfo banInfo
) {
    public static ZoneFriendSearchPlayerRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendSearchPlayerRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZoneFriendSearchPlayerRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendSearchPlayerRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
