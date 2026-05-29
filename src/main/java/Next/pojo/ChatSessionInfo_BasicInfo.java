// Generated from com_relation.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ChatSessionInfo_BasicInfo(
    int uin,
    long timeStamp
) {
    public static ChatSessionInfo_BasicInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChatSessionInfo_BasicInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ChatSessionInfo_BasicInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ChatSessionInfo_BasicInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
