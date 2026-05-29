// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillMissileStopTraceInfo(
    int skillId,
    String GUID,
    Point pt,
    float curLaunchTime,
    long launchBulletId
) {
    public static WorldCombatDotsSkillMissileStopTraceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillMissileStopTraceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static WorldCombatDotsSkillMissileStopTraceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillMissileStopTraceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
