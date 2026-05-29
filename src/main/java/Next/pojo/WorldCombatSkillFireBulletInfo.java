// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatSkillFireBulletInfo(
    int skillId,
    long bulletId
) {
    public static WorldCombatSkillFireBulletInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatSkillFireBulletInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static WorldCombatSkillFireBulletInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatSkillFireBulletInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
