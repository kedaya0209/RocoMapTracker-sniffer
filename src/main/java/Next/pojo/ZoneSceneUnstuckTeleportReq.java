// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneUnstuckTeleportReq(
    boolean ignoreCooldown
) {
    public static ZoneSceneUnstuckTeleportReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneUnstuckTeleportReq(
            Pojos.readBool(fields, 1)
        );
    }
    public static ZoneSceneUnstuckTeleportReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneUnstuckTeleportReq(
            Pojos.readBool(fields, 1)
        );
    }
}
