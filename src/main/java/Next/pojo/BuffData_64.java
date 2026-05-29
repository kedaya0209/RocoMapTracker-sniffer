// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_64(
    List<BuffData_64_Skill> data
) {
    public static BuffData_64 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_64(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_64_Skill::parseFrom).toList()
        );
    }
    public static BuffData_64 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_64(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_64_Skill::parseFrom).toList()
        );
    }
}
