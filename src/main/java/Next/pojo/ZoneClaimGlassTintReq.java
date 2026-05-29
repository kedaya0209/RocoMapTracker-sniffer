// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClaimGlassTintReq(
    int fashionBondId,
    boolean isShining,
    GlassInfo glass,
    int fashionItemId
) {
    public static ZoneClaimGlassTintReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClaimGlassTintReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneClaimGlassTintReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClaimGlassTintReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
}
