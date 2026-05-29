// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldCombatDotsSkillSelectPos(
    long actorId,
    WorldCombatDotsSkillSelectPosInfo skillSelectPos
) {
    public static SpaceAct_WorldCombatDotsSkillSelectPos parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldCombatDotsSkillSelectPos(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillSelectPosInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_WorldCombatDotsSkillSelectPos parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldCombatDotsSkillSelectPos(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillSelectPosInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
