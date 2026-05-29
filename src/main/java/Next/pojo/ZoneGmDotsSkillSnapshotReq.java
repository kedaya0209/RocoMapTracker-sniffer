// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmDotsSkillSnapshotReq(
    long actorId
) {
    public static ZoneGmDotsSkillSnapshotReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmDotsSkillSnapshotReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneGmDotsSkillSnapshotReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmDotsSkillSnapshotReq(
            Pojos.readLong(fields, 1)
        );
    }
}
