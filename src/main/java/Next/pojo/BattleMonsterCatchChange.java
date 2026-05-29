// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleMonsterCatchChange(
    int monsterId,
    int catchCondId
) {
    public static BattleMonsterCatchChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleMonsterCatchChange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BattleMonsterCatchChange parseFrom(java.util.List<ProtoField> fields) {
        return new BattleMonsterCatchChange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
