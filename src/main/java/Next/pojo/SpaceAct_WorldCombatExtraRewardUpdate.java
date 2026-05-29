// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_WorldCombatExtraRewardUpdate(
    int worldCombatId,
    long npcId,
    List<WorldCombatExtraRewardInfo> extraRewardList
) {
    public static SpaceAct_WorldCombatExtraRewardUpdate parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldCombatExtraRewardUpdate(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_WorldCombatExtraRewardUpdate parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldCombatExtraRewardUpdate(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList()
        );
    }
}
