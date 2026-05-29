// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_BattleAIStatusChanged(
    long actorId,
    long battleAiStatus
) {
    public static SpaceAct_BattleAIStatusChanged parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_BattleAIStatusChanged(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static SpaceAct_BattleAIStatusChanged parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_BattleAIStatusChanged(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
