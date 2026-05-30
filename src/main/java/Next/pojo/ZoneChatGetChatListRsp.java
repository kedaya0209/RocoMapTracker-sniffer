// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneChatGetChatListRsp(
    RetInfo retInfo,
    List<ChatSessionInfo> chatSessionList,
    int firstChatSessionUin,
    List<ChatMessageInfo> firstChatMessageList,
    int packIndex,
    boolean isEnd,
    int reqUin
) {
    public static ZoneChatGetChatListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChatGetChatListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ChatSessionInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ChatMessageInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static ZoneChatGetChatListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChatGetChatListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ChatSessionInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ChatMessageInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
