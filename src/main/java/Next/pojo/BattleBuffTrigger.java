// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleBuffTrigger(
    int casterId,
    int targetId,
    int buffId,
    List<Integer> buffbaseIds,
    int performType,
    boolean needSelectPet,
    boolean frozenDeath
) {
    public static BattleBuffTrigger parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleBuffTrigger(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
    public static BattleBuffTrigger parseFrom(java.util.List<ProtoField> fields) {
        return new BattleBuffTrigger(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
}
