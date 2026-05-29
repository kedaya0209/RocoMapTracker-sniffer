// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldAttackCollideReq(
    long attackActorId
) {
    public static ZoneSceneWorldAttackCollideReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldAttackCollideReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneSceneWorldAttackCollideReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldAttackCollideReq(
            Pojos.readLong(fields, 1)
        );
    }
}
