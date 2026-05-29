// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatExitReq(
    long npcId
) {
    public static ZoneSceneWorldCombatExitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatExitReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneSceneWorldCombatExitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatExitReq(
            Pojos.readLong(fields, 1)
        );
    }
}
