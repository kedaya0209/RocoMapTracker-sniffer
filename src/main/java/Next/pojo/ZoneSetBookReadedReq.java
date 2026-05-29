// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetBookReadedReq(
    int bookType,
    int bookId
) {
    public static ZoneSetBookReadedReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetBookReadedReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSetBookReadedReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetBookReadedReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
}
