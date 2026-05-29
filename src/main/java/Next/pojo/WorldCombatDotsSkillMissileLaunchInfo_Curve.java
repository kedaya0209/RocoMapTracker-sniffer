// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillMissileLaunchInfo_Curve(
    Position launchPos,
    float curveFlyTime
) {
    public static WorldCombatDotsSkillMissileLaunchInfo_Curve parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillMissileLaunchInfo_Curve(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readFloat(fields, 2)
        );
    }
    public static WorldCombatDotsSkillMissileLaunchInfo_Curve parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillMissileLaunchInfo_Curve(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readFloat(fields, 2)
        );
    }
}
