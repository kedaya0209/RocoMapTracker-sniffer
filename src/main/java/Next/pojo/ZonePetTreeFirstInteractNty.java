// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetTreeFirstInteractNty(
    int petBaseId,
    int fashionBondId
) {
    public static ZonePetTreeFirstInteractNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTreeFirstInteractNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZonePetTreeFirstInteractNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTreeFirstInteractNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
