// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmQueryPetClosenessReq(
    int petGid
) {
    public static ZoneGmQueryPetClosenessReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmQueryPetClosenessReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmQueryPetClosenessReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmQueryPetClosenessReq(
            Pojos.readInt(fields, 1)
        );
    }
}
