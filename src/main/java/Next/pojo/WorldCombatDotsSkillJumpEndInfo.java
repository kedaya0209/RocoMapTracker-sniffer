// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillJumpEndInfo(
    int skillId,
    String GUID
) {
    public static WorldCombatDotsSkillJumpEndInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillJumpEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static WorldCombatDotsSkillJumpEndInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillJumpEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
