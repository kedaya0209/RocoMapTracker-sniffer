// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FeatureResonance(
    int skillId
) {
    public static FeatureResonance parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FeatureResonance(
            Pojos.readInt(fields, 1)
        );
    }
    public static FeatureResonance parseFrom(java.util.List<ProtoField> fields) {
        return new FeatureResonance(
            Pojos.readInt(fields, 1)
        );
    }
}
