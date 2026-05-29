// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChatGetChatMessageReq(
    int uin,
    int offset,
    int count,
    int visitOwnerUin
) {
    public static ZoneChatGetChatMessageReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChatGetChatMessageReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneChatGetChatMessageReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChatGetChatMessageReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
