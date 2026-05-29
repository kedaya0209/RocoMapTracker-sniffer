// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillMissileDestroyInfo(
    int skillId,
    String GUID,
    long launchBulletId
) {
    public static WorldCombatDotsSkillMissileDestroyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillMissileDestroyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static WorldCombatDotsSkillMissileDestroyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillMissileDestroyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
