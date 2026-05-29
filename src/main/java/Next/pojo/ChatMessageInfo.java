// Generated from com_relation.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ChatMessageInfo(
    int uin,
    byte[] chatMessage,
    long timeStamp,
    ChatMessageInfo_MsgDetailInfo msgDetailInfo,
    int chatMsgType,
    GiftData giftData,
    long msgUid
) {
    public static ChatMessageInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChatMessageInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ChatMessageInfo_MsgDetailInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5, 0),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.GiftData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7)
        );
    }
    public static ChatMessageInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ChatMessageInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ChatMessageInfo_MsgDetailInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5, 0),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.GiftData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7)
        );
    }
}
