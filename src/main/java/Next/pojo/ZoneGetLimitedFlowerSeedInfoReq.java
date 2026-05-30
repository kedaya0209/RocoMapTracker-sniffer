// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetLimitedFlowerSeedInfoReq(
    int activityId
) {
    public static ZoneGetLimitedFlowerSeedInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetLimitedFlowerSeedInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetLimitedFlowerSeedInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetLimitedFlowerSeedInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
