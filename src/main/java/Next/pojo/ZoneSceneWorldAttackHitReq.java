// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldAttackHitReq(
    long attackActorId,
    long hitActorId
) {
    public static ZoneSceneWorldAttackHitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldAttackHitReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneSceneWorldAttackHitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldAttackHitReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
