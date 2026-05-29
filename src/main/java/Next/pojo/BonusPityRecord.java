// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BonusPityRecord(
    int bonusEventPoolCfgId,
    int selectedTimes
) {
    public static BonusPityRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BonusPityRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BonusPityRecord parseFrom(java.util.List<ProtoField> fields) {
        return new BonusPityRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
