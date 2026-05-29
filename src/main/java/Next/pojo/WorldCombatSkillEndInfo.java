// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatSkillEndInfo(
    int skillId,
    boolean endReason
) {
    public static WorldCombatSkillEndInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatSkillEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static WorldCombatSkillEndInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatSkillEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
