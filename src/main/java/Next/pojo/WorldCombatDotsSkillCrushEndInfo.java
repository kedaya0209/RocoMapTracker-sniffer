// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillCrushEndInfo(
    int skillId,
    String GUID,
    Point stopPoint,
    float actionTime,
    long timeStamp
) {
    public static WorldCombatDotsSkillCrushEndInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillCrushEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static WorldCombatDotsSkillCrushEndInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillCrushEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
