// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleRoleSkillCast(
    int casterUin,
    int skillId,
    int petId,
    boolean isCallSuccess
) {
    public static BattleRoleSkillCast parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoleSkillCast(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static BattleRoleSkillCast parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoleSkillCast(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
