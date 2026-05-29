// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillMissileLaunchInfo_Normal(
    float accelerateSpeed,
    float maxSpeed,
    boolean isKeepLandHeight,
    int landHeight
) {
    public static WorldCombatDotsSkillMissileLaunchInfo_Normal parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillMissileLaunchInfo_Normal(
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static WorldCombatDotsSkillMissileLaunchInfo_Normal parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillMissileLaunchInfo_Normal(
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
