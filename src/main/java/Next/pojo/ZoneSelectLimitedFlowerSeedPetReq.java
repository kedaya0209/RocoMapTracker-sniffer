// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSelectLimitedFlowerSeedPetReq(
    int specFlowerSeedId,
    int activityId
) {
    public static ZoneSelectLimitedFlowerSeedPetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSelectLimitedFlowerSeedPetReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSelectLimitedFlowerSeedPetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSelectLimitedFlowerSeedPetReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
