// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneLeaveWorldCombatAreaReq(
    long npcId
) {
    public static ZoneSceneLeaveWorldCombatAreaReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneLeaveWorldCombatAreaReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneSceneLeaveWorldCombatAreaReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneLeaveWorldCombatAreaReq(
            Pojos.readLong(fields, 1)
        );
    }
}
