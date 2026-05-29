// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LegendaryBattleInfo(
    boolean isSeasonBattle,
    int seasonBattleId
) {
    public static LegendaryBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LegendaryBattleInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static LegendaryBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new LegendaryBattleInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
