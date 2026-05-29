// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldCombatDotsSkillShowHideChange(
    long actorId,
    WorldCombatDotsSkillShowHideInfo showHideInfo
) {
    public static SpaceAct_WorldCombatDotsSkillShowHideChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldCombatDotsSkillShowHideChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_WorldCombatDotsSkillShowHideChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldCombatDotsSkillShowHideChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
