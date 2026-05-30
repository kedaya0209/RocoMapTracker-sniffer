// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PveSeasonInfo(
    List<Integer> bossRuleIds,
    List<Integer> playerBuffs,
    List<Integer> playerFeatureSkill,
    List<Integer> playerAttributeAdd,
    List<Integer> bagBuffs,
    List<Integer> playerPetAdd,
    int seasonBattleId
) {
    public static PveSeasonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PveSeasonInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static PveSeasonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PveSeasonInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
