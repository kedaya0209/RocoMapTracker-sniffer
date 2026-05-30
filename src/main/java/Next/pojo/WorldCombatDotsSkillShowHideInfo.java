// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillShowHideInfo(
    boolean showState,
    List<WorldCombatDotsSkillShowHideCompInfo> compList
) {
    public static WorldCombatDotsSkillShowHideInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillShowHideInfo(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldCombatDotsSkillShowHideCompInfo::parseFrom).toList()
        );
    }
    public static WorldCombatDotsSkillShowHideInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillShowHideInfo(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldCombatDotsSkillShowHideCompInfo::parseFrom).toList()
        );
    }
}
