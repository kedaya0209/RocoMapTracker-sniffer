// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetPetHabitatReq(
    int petBaseId
) {
    public static ZoneGetPetHabitatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPetHabitatReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetPetHabitatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPetHabitatReq(
            Pojos.readInt(fields, 1)
        );
    }
}
