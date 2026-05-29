// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetHandbookStatReq(
    int page,
    long version
) {
    public static ZoneGetHandbookStatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetHandbookStatReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneGetHandbookStatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetHandbookStatReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
