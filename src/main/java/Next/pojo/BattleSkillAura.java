// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleSkillAura(
    int skillId,
    int castMoment
) {
    public static BattleSkillAura parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSkillAura(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3)
        );
    }
    public static BattleSkillAura parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSkillAura(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3)
        );
    }
}
