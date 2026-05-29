// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_WorldCombatBegin(
    long npcId,
    List<Long> avatarId,
    int worldCombatId,
    int worldCombatCfgId,
    int worldCombatPhase
) {
    public static SpaceAct_WorldCombatBegin parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldCombatBegin(
            Pojos.readLong(fields, 1),
            Pojos.readLongList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static SpaceAct_WorldCombatBegin parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldCombatBegin(
            Pojos.readLong(fields, 1),
            Pojos.readLongList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
