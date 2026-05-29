// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleMonsterCatchInfo(
    int threshold,
    int initialThreshold,
    int familarityChange,
    List<BattleCatchProbInfo> catchProbList
) {
    public static BattleMonsterCatchInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleMonsterCatchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleCatchProbInfo::parseFrom).toList()
        );
    }
    public static BattleMonsterCatchInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleMonsterCatchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleCatchProbInfo::parseFrom).toList()
        );
    }
}
