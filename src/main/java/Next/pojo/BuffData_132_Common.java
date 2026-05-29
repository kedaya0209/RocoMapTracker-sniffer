// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_132_Common(
    List<BuffData_132_data> data
) {
    public static BuffData_132_Common parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_132_Common(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_132_data::parseFrom).toList()
        );
    }
    public static BuffData_132_Common parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_132_Common(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_132_data::parseFrom).toList()
        );
    }
}
