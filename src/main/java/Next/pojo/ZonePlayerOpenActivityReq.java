// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerOpenActivityReq(
    int activityId
) {
    public static ZonePlayerOpenActivityReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerOpenActivityReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePlayerOpenActivityReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerOpenActivityReq(
            Pojos.readInt(fields, 1)
        );
    }
}
