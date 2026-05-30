// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillHiddenInfo(
    int skillId,
    String GUID,
    boolean showState
) {
    public static WorldCombatDotsSkillHiddenInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillHiddenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static WorldCombatDotsSkillHiddenInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillHiddenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
