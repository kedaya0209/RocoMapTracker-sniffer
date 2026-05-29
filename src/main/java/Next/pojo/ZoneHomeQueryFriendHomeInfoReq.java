// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeQueryFriendHomeInfoReq(
    int uin,
    int queryInfoType
) {
    public static ZoneHomeQueryFriendHomeInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeQueryFriendHomeInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneHomeQueryFriendHomeInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeQueryFriendHomeInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
