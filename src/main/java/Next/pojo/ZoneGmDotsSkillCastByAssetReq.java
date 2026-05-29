// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmDotsSkillCastByAssetReq(
    long actorId,
    int skillId,
    byte[] skillAssetContent
) {
    public static ZoneGmDotsSkillCastByAssetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmDotsSkillCastByAssetReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static ZoneGmDotsSkillCastByAssetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmDotsSkillCastByAssetReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
