// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_WorldCombatSkill(
    int skillId,
    Point casterPos,
    long targetId,
    Position targetPos,
    float currentTime,
    List<WorldCombatSkillTarget> targetGroup,
    List<ActorInfo_WorldCombatSkillAction> actionsData,
    WorldCombatDotsSkillShowHideInfo showHideInfo
) {
    public static ActorInfo_WorldCombatSkill parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_WorldCombatSkill(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.WorldCombatSkillTarget::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.ActorInfo_WorldCombatSkillAction::parseFrom).toList(),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static ActorInfo_WorldCombatSkill parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_WorldCombatSkill(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.WorldCombatSkillTarget::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.ActorInfo_WorldCombatSkillAction::parseFrom).toList(),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
