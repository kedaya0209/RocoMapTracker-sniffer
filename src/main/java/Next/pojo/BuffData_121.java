// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_121(
    List<BuffData_121_Common> data
) {
    public static BuffData_121 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_121(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_121_Common::parseFrom).toList()
        );
    }
    public static BuffData_121 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_121(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_121_Common::parseFrom).toList()
        );
    }
}
