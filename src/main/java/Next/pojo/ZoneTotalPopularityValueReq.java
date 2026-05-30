// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTotalPopularityValueReq(
    int activityId
) {
    public static ZoneTotalPopularityValueReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTotalPopularityValueReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneTotalPopularityValueReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTotalPopularityValueReq(
            Pojos.readInt(fields, 1)
        );
    }
}
