// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmDotsSkillStopReq(
    long actorId,
    int skillId
) {
    public static ZoneGmDotsSkillStopReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmDotsSkillStopReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneGmDotsSkillStopReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmDotsSkillStopReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
