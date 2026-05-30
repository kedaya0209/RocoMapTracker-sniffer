// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FinalBattleInfo(
    int finalBattleEnergy,
    boolean isFinalBattleEnergyFull
) {
    public static FinalBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FinalBattleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static FinalBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FinalBattleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
