// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetOwlSanctuaryFruitInfoReq(
    int contentId
) {
    public static ZoneGetOwlSanctuaryFruitInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetOwlSanctuaryFruitInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetOwlSanctuaryFruitInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetOwlSanctuaryFruitInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
