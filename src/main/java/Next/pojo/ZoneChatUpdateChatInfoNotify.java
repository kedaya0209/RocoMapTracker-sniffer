// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChatUpdateChatInfoNotify(
    ChatMessageInfo chatMessage,
    ChatSessionInfo chatSession
) {
    public static ZoneChatUpdateChatInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChatUpdateChatInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ChatMessageInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ChatSessionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneChatUpdateChatInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChatUpdateChatInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ChatMessageInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ChatSessionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
