// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_WorldCombatSkill(
    ActorWorldCombatSkillInfo skillInfo
) {
    public static ActorCompData_WorldCombatSkill parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_WorldCombatSkill(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorWorldCombatSkillInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorCompData_WorldCombatSkill parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_WorldCombatSkill(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorWorldCombatSkillInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
