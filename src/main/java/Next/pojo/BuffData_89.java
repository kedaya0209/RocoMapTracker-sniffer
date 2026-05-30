// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_89(
    List<BuffData_89_Buff> data
) {
    public static BuffData_89 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_89(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_89_Buff::parseFrom).toList()
        );
    }
    public static BuffData_89 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_89(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_89_Buff::parseFrom).toList()
        );
    }
}
