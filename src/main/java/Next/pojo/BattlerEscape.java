// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattlerEscape(
    int uin,
    int reason
) {
    public static BattlerEscape parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlerEscape(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static BattlerEscape parseFrom(java.util.List<ProtoField> fields) {
        return new BattlerEscape(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
