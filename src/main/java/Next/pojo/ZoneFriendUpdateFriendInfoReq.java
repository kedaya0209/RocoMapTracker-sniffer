// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendUpdateFriendInfoReq(
    int uin,
    byte[] note,
    boolean isPinned,
    int type
) {
    public static ZoneFriendUpdateFriendInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendUpdateFriendInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static ZoneFriendUpdateFriendInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendUpdateFriendInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
