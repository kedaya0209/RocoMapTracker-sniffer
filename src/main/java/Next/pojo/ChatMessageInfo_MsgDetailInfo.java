// Generated from com_relation.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ChatMessageInfo_MsgDetailInfo(
    int sessionUin,
    byte[] name,
    byte[] note,
    int cardIconSelected,
    boolean needCypher,
    boolean isFriend
) {
    public static ChatMessageInfo_MsgDetailInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChatMessageInfo_MsgDetailInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
    public static ChatMessageInfo_MsgDetailInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ChatMessageInfo_MsgDetailInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
}
