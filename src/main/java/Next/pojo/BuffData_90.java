// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_90(
    List<BuffData_90_Convert> convert,
    List<BuffData_90_Raw> raw
) {
    public static BuffData_90 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_90(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_90_Convert::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BuffData_90_Raw::parseFrom).toList()
        );
    }
    public static BuffData_90 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_90(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_90_Convert::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BuffData_90_Raw::parseFrom).toList()
        );
    }
}
