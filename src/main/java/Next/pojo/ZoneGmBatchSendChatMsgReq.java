// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmBatchSendChatMsgReq(
    int sendUin,
    int recvUin,
    String chatMsg,
    int repeatedCount
) {
    public static ZoneGmBatchSendChatMsgReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmBatchSendChatMsgReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneGmBatchSendChatMsgReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmBatchSendChatMsgReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
