// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneActivityFactionRankReq(
    int activityId
) {
    public static ZoneActivityFactionRankReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivityFactionRankReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneActivityFactionRankReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivityFactionRankReq(
            Pojos.readInt(fields, 1)
        );
    }
}
