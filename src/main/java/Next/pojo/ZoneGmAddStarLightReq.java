// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmAddStarLightReq(
    int addNum
) {
    public static ZoneGmAddStarLightReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmAddStarLightReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmAddStarLightReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmAddStarLightReq(
            Pojos.readInt(fields, 1)
        );
    }
}
