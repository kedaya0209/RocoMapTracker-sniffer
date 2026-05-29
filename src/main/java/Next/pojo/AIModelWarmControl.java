// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AIModelWarmControl(
    boolean warmControlEnable,
    boolean warmControlRestraintPet,
    float warmControlAttackRatio,
    float warmActionProbsThreshold,
    int warmControlEnergyThr,
    int warmControlAttackThr,
    int warmControlHurtThr
) {
    public static AIModelWarmControl parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AIModelWarmControl(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static AIModelWarmControl parseFrom(java.util.List<ProtoField> fields) {
        return new AIModelWarmControl(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
