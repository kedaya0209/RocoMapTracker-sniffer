// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillShowHideCompInfo(
    String compName,
    boolean showState,
    boolean propagateToChildren
) {
    public static WorldCombatDotsSkillShowHideCompInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillShowHideCompInfo(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static WorldCombatDotsSkillShowHideCompInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillShowHideCompInfo(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
