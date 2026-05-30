// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_81(
    int hpMod,
    int enMod
) {
    public static BuffData_81 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_81(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_81 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_81(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
