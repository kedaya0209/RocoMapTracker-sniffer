// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldCombatPhaseUpdate(
    int worldCombatId,
    long npcId,
    int worldCombatPhase
) {
    public static SpaceAct_WorldCombatPhaseUpdate parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldCombatPhaseUpdate(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static SpaceAct_WorldCombatPhaseUpdate parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldCombatPhaseUpdate(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
