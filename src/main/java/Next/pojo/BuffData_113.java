// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_113(
    List<BuffData_113_Common> petInfo
) {
    public static BuffData_113 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_113(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_113_Common::parseFrom).toList()
        );
    }
    public static BuffData_113 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_113(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_113_Common::parseFrom).toList()
        );
    }
}
