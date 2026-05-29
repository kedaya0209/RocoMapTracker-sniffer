// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneQueryPetBalancedAttrReq(
    List<Integer> gid,
    boolean isWeeklyChallenge
) {
    public static ZoneQueryPetBalancedAttrReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryPetBalancedAttrReq(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneQueryPetBalancedAttrReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryPetBalancedAttrReq(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
