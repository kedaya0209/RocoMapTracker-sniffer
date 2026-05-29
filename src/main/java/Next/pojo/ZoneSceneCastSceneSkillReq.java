// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneCastSceneSkillReq(
    int timeStamp,
    int skillId,
    int skillStatusType,
    boolean isAddStatus
) {
    public static ZoneSceneCastSceneSkillReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneCastSceneSkillReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static ZoneSceneCastSceneSkillReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneCastSceneSkillReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
