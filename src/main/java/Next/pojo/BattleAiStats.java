// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleAiStats(
    long battleRoleHp,
    List<Integer> petIds,
    List<Integer> petIsalive,
    int numRestraint,
    int numBerestraint,
    int numResist,
    int numBeresist,
    int numCounter,
    int numBecounter,
    List<Integer> totalDamageHp,
    List<Integer> totalBedamageHp,
    List<Integer> extraEnergyBuffs,
    List<Integer> extraEnergyBuffSum,
    List<Integer> extraEnergyDebuffs,
    List<Integer> extraEnergyDebuffSum,
    List<Integer> numInBattle
) {
    public static BattleAiStats parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleAiStats(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readIntList(fields, 11),
            Pojos.readIntList(fields, 12),
            Pojos.readIntList(fields, 13),
            Pojos.readIntList(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readIntList(fields, 16)
        );
    }
    public static BattleAiStats parseFrom(java.util.List<ProtoField> fields) {
        return new BattleAiStats(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readIntList(fields, 11),
            Pojos.readIntList(fields, 12),
            Pojos.readIntList(fields, 13),
            Pojos.readIntList(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readIntList(fields, 16)
        );
    }
}
