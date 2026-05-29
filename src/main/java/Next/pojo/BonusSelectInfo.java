// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BonusSelectInfo(
    int bonusEventPoolCfgId,
    int selectTimes,
    int weight,
    float rate
) {
    public static BonusSelectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BonusSelectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
    public static BonusSelectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BonusSelectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
}
