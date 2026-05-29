// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmDotsSkillCastReq(
    long actorId,
    int skillId
) {
    public static ZoneGmDotsSkillCastReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmDotsSkillCastReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneGmDotsSkillCastReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmDotsSkillCastReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
