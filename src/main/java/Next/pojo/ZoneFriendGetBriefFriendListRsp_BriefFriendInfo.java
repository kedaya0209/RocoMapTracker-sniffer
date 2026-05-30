// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendGetBriefFriendListRsp_BriefFriendInfo(
    int uin,
    byte[] note,
    long pinnedTime,
    int friendType,
    byte[] platNickName
) {
    public static ZoneFriendGetBriefFriendListRsp_BriefFriendInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendGetBriefFriendListRsp_BriefFriendInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5)
        );
    }
    public static ZoneFriendGetBriefFriendListRsp_BriefFriendInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendGetBriefFriendListRsp_BriefFriendInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5)
        );
    }
}
