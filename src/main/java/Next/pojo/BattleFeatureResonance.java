// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleFeatureResonance(
    int petId
) {
    public static BattleFeatureResonance parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleFeatureResonance(
            Pojos.readInt(fields, 1)
        );
    }
    public static BattleFeatureResonance parseFrom(java.util.List<ProtoField> fields) {
        return new BattleFeatureResonance(
            Pojos.readInt(fields, 1)
        );
    }
}
