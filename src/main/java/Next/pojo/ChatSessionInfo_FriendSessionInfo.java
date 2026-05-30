// Generated from com_relation.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ChatSessionInfo_FriendSessionInfo(
    byte[] name,
    byte[] note,
    byte[] headImg,
    int cardIconSelected,
    boolean online,
    int lastLogoutTime,
    int state,
    PlayerBattleBriefInfo battleBriefInfo,
    int gende,
    int levelAwardInfo,
    int registDate,
    int worldLevel,
    int offlineMsgNum,
    FriendVisitInfo visitInfo
) {
    public static ChatSessionInfo_FriendSessionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChatSessionInfo_FriendSessionInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7, 0),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.FriendVisitInfo.parseFrom(Pojos.readMessage(fields, 14)) : null
        );
    }
    public static ChatSessionInfo_FriendSessionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ChatSessionInfo_FriendSessionInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7, 0),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.FriendVisitInfo.parseFrom(Pojos.readMessage(fields, 14)) : null
        );
    }
}
