// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillSelectPosInfo(
    int skillId,
    String GUID,
    List<WorldCombatDotsSkillSelectPosInfo_SelectPosInfo> selectPos
) {
    public static WorldCombatDotsSkillSelectPosInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillSelectPosInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.WorldCombatDotsSkillSelectPosInfo_SelectPosInfo::parseFrom).toList()
        );
    }
    public static WorldCombatDotsSkillSelectPosInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillSelectPosInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.WorldCombatDotsSkillSelectPosInfo_SelectPosInfo::parseFrom).toList()
        );
    }
}
