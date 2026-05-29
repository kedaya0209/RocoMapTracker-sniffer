// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetBagItemInfoByPageReq(
    int page,
    long version
) {
    public static ZoneGetBagItemInfoByPageReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetBagItemInfoByPageReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneGetBagItemInfoByPageReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetBagItemInfoByPageReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
