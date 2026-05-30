// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatSkillBuffInfo(
    int skillId,
    int operateType,
    int buffId,
    int actionIdx,
    long casterId,
    long targetId,
    float durationChange,
    float duration,
    float effectTickInterval
) {
    public static WorldCombatSkillBuffInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatSkillBuffInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readFloat(fields, 9)
        );
    }
    public static WorldCombatSkillBuffInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatSkillBuffInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readFloat(fields, 9)
        );
    }
}
