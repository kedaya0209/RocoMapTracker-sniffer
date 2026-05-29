// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleCatchCondCounters(
    List<BattleMonsterCatchCondCounter> counters
) {
    public static BattleCatchCondCounters parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleCatchCondCounters(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleMonsterCatchCondCounter::parseFrom).toList()
        );
    }
    public static BattleCatchCondCounters parseFrom(java.util.List<ProtoField> fields) {
        return new BattleCatchCondCounters(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleMonsterCatchCondCounter::parseFrom).toList()
        );
    }
}
