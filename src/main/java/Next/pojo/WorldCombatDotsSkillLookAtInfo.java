// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillLookAtInfo(
    int skillId,
    long targetId,
    int attachPointType,
    String GUID,
    Position targetPos
) {
    public static WorldCombatDotsSkillLookAtInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillLookAtInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static WorldCombatDotsSkillLookAtInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillLookAtInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
