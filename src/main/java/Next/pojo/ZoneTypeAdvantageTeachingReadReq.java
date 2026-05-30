// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTypeAdvantageTeachingReadReq(
    int id
) {
    public static ZoneTypeAdvantageTeachingReadReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTypeAdvantageTeachingReadReq(
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneTypeAdvantageTeachingReadReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTypeAdvantageTeachingReadReq(
            Pojos.readInt(fields, 2)
        );
    }
}
