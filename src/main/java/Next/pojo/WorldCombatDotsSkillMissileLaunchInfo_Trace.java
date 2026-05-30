// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillMissileLaunchInfo_Trace(
    float accelerateSpeed,
    float maxSpeed,
    float angleSpeed,
    float cancelTraceDist,
    float traceDurTime,
    boolean isKeepLandHeight,
    int landHeight
) {
    public static WorldCombatDotsSkillMissileLaunchInfo_Trace parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillMissileLaunchInfo_Trace(
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readFloat(fields, 9),
            Pojos.readFloat(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static WorldCombatDotsSkillMissileLaunchInfo_Trace parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillMissileLaunchInfo_Trace(
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readFloat(fields, 9),
            Pojos.readFloat(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
