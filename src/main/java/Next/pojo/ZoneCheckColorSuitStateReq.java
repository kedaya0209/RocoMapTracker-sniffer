// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCheckColorSuitStateReq(
    int fashionBondId
) {
    public static ZoneCheckColorSuitStateReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCheckColorSuitStateReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneCheckColorSuitStateReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCheckColorSuitStateReq(
            Pojos.readInt(fields, 1)
        );
    }
}
