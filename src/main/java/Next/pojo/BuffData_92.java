// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_92(
    boolean auraOn
) {
    public static BuffData_92 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_92(
            Pojos.readBool(fields, 1)
        );
    }
    public static BuffData_92 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_92(
            Pojos.readBool(fields, 1)
        );
    }
}
