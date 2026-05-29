// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_90_Raw(
    int dst,
    int stack
) {
    public static BuffData_90_Raw parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_90_Raw(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_90_Raw parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_90_Raw(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
