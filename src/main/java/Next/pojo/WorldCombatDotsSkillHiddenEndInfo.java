// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillHiddenEndInfo(
    int skillId,
    String GUID,
    boolean showState
) {
    public static WorldCombatDotsSkillHiddenEndInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillHiddenEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static WorldCombatDotsSkillHiddenEndInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillHiddenEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
