// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleSpEnergyTrigger(
    int damType,
    int triggerType,
    int casterId,
    int oldSkillId,
    int newSkillId
) {
    public static BattleSpEnergyTrigger parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSpEnergyTrigger(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static BattleSpEnergyTrigger parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSpEnergyTrigger(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
