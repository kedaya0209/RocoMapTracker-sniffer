// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillCrushInfo(
    int skillId,
    Position rotator,
    float crushDuration,
    String GUID,
    Position crushFinalPos,
    long timeStamp
) {
    public static WorldCombatDotsSkillCrushInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillCrushInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readFloat(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6)
        );
    }
    public static WorldCombatDotsSkillCrushInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillCrushInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readFloat(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6)
        );
    }
}
