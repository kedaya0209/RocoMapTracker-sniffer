// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmSetPetTravelCompleteReq(
    List<Integer> petGid
) {
    public static ZoneGmSetPetTravelCompleteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSetPetTravelCompleteReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneGmSetPetTravelCompleteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSetPetTravelCompleteReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
