// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_126_Common(
    int buffId,
    int stack
) {
    public static BuffData_126_Common parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_126_Common(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_126_Common parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_126_Common(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
