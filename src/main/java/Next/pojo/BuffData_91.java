// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_91(
    int sumStacks,
    int skillId
) {
    public static BuffData_91 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_91(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_91 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_91(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
