// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetEvoluteReq(
    int petGid,
    int chosenEvolveIdx
) {
    public static ZonePetEvoluteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetEvoluteReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZonePetEvoluteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetEvoluteReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
