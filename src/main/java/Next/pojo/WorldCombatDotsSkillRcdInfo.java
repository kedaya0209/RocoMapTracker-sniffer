// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillRcdInfo(
    int skillId,
    String GUID,
    long targetId,
    Position targetPos,
    boolean rayEndNeedMove,
    long exTargetId,
    Position exTargetPos
) {
    public static WorldCombatDotsSkillRcdInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillRcdInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
    public static WorldCombatDotsSkillRcdInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillRcdInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
}
