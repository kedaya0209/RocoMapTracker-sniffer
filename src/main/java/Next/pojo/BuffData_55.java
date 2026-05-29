// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_55(
    int skillId
) {
    public static BuffData_55 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_55(
            Pojos.readInt(fields, 1)
        );
    }
    public static BuffData_55 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_55(
            Pojos.readInt(fields, 1)
        );
    }
}
