// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneNtyAuraEnableStReq(
    long auraId,
    boolean isEnabled
) {
    public static ZoneSceneNtyAuraEnableStReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNtyAuraEnableStReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneNtyAuraEnableStReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNtyAuraEnableStReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
