// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChatSendChatMessageReq(
    int uin,
    byte[] chatMessage,
    int visitOwnerUin
) {
    public static ZoneChatSendChatMessageReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChatSendChatMessageReq(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneChatSendChatMessageReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChatSendChatMessageReq(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
