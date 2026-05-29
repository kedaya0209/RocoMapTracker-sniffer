// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneReEnterWorldCombatAreaReq(
    long npcId
) {
    public static ZoneSceneReEnterWorldCombatAreaReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneReEnterWorldCombatAreaReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneSceneReEnterWorldCombatAreaReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneReEnterWorldCombatAreaReq(
            Pojos.readLong(fields, 1)
        );
    }
}
