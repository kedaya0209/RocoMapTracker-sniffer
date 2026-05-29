// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneAutoSupplyCarryonReq(
    boolean isAutoSupply,
    int petGid
) {
    public static ZoneAutoSupplyCarryonReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneAutoSupplyCarryonReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneAutoSupplyCarryonReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneAutoSupplyCarryonReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
