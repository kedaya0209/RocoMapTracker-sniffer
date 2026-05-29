// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldCombatFinish(
    int worldCombatId,
    long npcId,
    int worldCombatCfgId,
    int worldCombatRes,
    boolean isBossChallenge,
    boolean isCombatAvatar
) {
    public static SpaceAct_WorldCombatFinish parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldCombatFinish(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
    public static SpaceAct_WorldCombatFinish parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldCombatFinish(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
}
