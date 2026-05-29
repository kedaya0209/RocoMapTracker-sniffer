// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneStartAllPetTravelAgainReq(
    List<PetTravelInfo> travelInfo
) {
    public static ZoneStartAllPetTravelAgainReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneStartAllPetTravelAgainReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetTravelInfo::parseFrom).toList()
        );
    }
    public static ZoneStartAllPetTravelAgainReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneStartAllPetTravelAgainReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetTravelInfo::parseFrom).toList()
        );
    }
}
