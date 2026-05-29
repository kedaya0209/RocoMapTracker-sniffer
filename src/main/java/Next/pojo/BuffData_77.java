// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_77(
    List<Integer> skillIds,
    int add
) {
    public static BuffData_77 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_77(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_77 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_77(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
