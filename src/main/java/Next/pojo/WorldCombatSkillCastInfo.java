// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatSkillCastInfo(
    int skillId
) {
    public static WorldCombatSkillCastInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatSkillCastInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static WorldCombatSkillCastInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatSkillCastInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
