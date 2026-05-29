// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatHitReq(
    long victimId,
    WorldCombatHitInfo hitInfo
) {
    public static ZoneSceneWorldCombatHitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatHitReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatHitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldCombatHitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatHitReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatHitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
