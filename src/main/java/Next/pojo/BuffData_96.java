// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_96(
    int originalHeight
) {
    public static BuffData_96 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_96(
            Pojos.readInt(fields, 1)
        );
    }
    public static BuffData_96 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_96(
            Pojos.readInt(fields, 1)
        );
    }
}
