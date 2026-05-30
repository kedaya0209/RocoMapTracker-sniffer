// Generated from com_relation.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ChatSessionInfo(
    int uin,
    byte[] name,
    byte[] note,
    byte[] headImg,
    long timeStamp,
    int cardIconSelected,
    ChatSessionInfo_BasicInfo basicInfo,
    ChatSessionInfo_FriendSessionInfo friendSessionInfo
) {
    public static ChatSessionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChatSessionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ChatSessionInfo_BasicInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.ChatSessionInfo_FriendSessionInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
    public static ChatSessionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ChatSessionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ChatSessionInfo_BasicInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.ChatSessionInfo_FriendSessionInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
}
