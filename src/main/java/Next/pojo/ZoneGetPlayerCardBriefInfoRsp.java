// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetPlayerCardBriefInfoRsp(
    RetInfo retInfo,
    PlayerCardBriefInfo playerCardBriefInfo,
    byte[] note,
    boolean isFriend,
    boolean isBlackRole,
    boolean online,
    int registerTimestamp,
    int pinnedTime,
    int friendType,
    byte[] platNickName,
    PlayerStartUpPrivilegeInfo startUpPrivilegeInfo
) {
    public static ZoneGetPlayerCardBriefInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPlayerCardBriefInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBytes(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBytes(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
    public static ZoneGetPlayerCardBriefInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPlayerCardBriefInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBytes(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBytes(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
}
