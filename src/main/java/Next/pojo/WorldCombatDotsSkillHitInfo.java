// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillHitInfo(
    int skillId,
    long targetId,
    Point hitPoint,
    String GUID,
    int blockType,
    int hitType,
    int hitPerformType
) {
    public static WorldCombatDotsSkillHitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillHitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7)
        );
    }
    public static WorldCombatDotsSkillHitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillHitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7)
        );
    }
}
