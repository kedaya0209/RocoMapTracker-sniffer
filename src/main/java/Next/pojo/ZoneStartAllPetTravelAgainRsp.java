// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneStartAllPetTravelAgainRsp(
    RetInfo retInfo,
    List<PetTravelInfo> travelInfo
) {
    public static ZoneStartAllPetTravelAgainRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneStartAllPetTravelAgainRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTravelInfo::parseFrom).toList()
        );
    }
    public static ZoneStartAllPetTravelAgainRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneStartAllPetTravelAgainRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetTravelInfo::parseFrom).toList()
        );
    }
}
