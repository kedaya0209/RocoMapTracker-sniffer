// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_56(
    List<BuffData_56_Skill> skillIds
) {
    public static BuffData_56 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_56(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_56_Skill::parseFrom).toList()
        );
    }
    public static BuffData_56 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_56(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_56_Skill::parseFrom).toList()
        );
    }
}
