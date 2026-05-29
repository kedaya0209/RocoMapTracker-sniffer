// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetClaimableGlassTintReq(
    int fashionBondId,
    boolean isShining
) {
    public static ZoneGetClaimableGlassTintReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetClaimableGlassTintReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneGetClaimableGlassTintReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetClaimableGlassTintReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
