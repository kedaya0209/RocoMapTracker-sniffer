// Generated from com_team_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcBattleAssist(
    int id,
    int petConfId,
    int petLevel,
    int npcId,
    List<Integer> petConfIds
) {
    public static NpcBattleAssist parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcBattleAssist(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static NpcBattleAssist parseFrom(java.util.List<ProtoField> fields) {
        return new NpcBattleAssist(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
