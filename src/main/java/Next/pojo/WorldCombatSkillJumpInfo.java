// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatSkillJumpInfo(
    int skillId,
    int actionIdx,
    long casterId
) {
    public static WorldCombatSkillJumpInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatSkillJumpInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static WorldCombatSkillJumpInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatSkillJumpInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
