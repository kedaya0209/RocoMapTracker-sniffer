// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FinalBattleData(
    boolean isFinalBattleEnergyFull,
    boolean switchToP2,
    int P2BattleCfgId
) {
    public static FinalBattleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FinalBattleData(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static FinalBattleData parseFrom(java.util.List<ProtoField> fields) {
        return new FinalBattleData(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
