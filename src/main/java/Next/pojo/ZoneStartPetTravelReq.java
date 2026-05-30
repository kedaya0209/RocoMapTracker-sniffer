// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneStartPetTravelReq(
    int campContentId,
    List<Integer> petGid,
    int travelLv
) {
    public static ZoneStartPetTravelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneStartPetTravelReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneStartPetTravelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneStartPetTravelReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
