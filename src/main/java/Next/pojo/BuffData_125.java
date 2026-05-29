// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_125(
    int changeHp,
    int changeEnergy
) {
    public static BuffData_125 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_125(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_125 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_125(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
