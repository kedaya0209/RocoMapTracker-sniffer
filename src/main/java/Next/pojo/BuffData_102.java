// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_102(
    List<Integer> oldBaseIds
) {
    public static BuffData_102 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_102(
            Pojos.readIntList(fields, 1)
        );
    }
    public static BuffData_102 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_102(
            Pojos.readIntList(fields, 1)
        );
    }
}
