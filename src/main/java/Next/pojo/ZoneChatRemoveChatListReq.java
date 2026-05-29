// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChatRemoveChatListReq(
    int uin
) {
    public static ZoneChatRemoveChatListReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChatRemoveChatListReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneChatRemoveChatListReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChatRemoveChatListReq(
            Pojos.readInt(fields, 1)
        );
    }
}
