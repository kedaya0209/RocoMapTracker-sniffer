// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_64_Skill(
    List<Integer> skillId,
    int val
) {
    public static BuffData_64_Skill parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_64_Skill(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_64_Skill parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_64_Skill(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
