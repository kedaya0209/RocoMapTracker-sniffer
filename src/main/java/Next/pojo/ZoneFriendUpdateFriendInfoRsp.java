// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendUpdateFriendInfoRsp(
    RetInfo retInfo,
    int uin,
    byte[] note,
    long pinnedTime,
    int type
) {
    public static ZoneFriendUpdateFriendInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendUpdateFriendInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5, 0)
        );
    }
    public static ZoneFriendUpdateFriendInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendUpdateFriendInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5, 0)
        );
    }
}
