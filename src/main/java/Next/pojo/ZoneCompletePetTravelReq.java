// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCompletePetTravelReq(
    int campContentId
) {
    public static ZoneCompletePetTravelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCompletePetTravelReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneCompletePetTravelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCompletePetTravelReq(
            Pojos.readInt(fields, 1)
        );
    }
}
