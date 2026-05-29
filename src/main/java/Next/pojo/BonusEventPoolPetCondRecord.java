// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BonusEventPoolPetCondRecord(
    List<Integer> bonusEventPoolCfgId
) {
    public static BonusEventPoolPetCondRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BonusEventPoolPetCondRecord(
            Pojos.readIntList(fields, 1)
        );
    }
    public static BonusEventPoolPetCondRecord parseFrom(java.util.List<ProtoField> fields) {
        return new BonusEventPoolPetCondRecord(
            Pojos.readIntList(fields, 1)
        );
    }
}
