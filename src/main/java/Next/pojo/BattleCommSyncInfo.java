// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleCommSyncInfo(
    int spEnergyType,
    int spEnergyChange,
    int spEnergyResult,
    int finalBattleEnergyChange,
    int finalBattleEnergyResult,
    int b1PhantomPointChange,
    int b1PhantomPointResult
) {
    public static BattleCommSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleCommSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static BattleCommSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleCommSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
