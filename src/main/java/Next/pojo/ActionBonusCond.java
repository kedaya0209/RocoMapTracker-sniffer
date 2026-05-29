// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActionBonusCond(
    int condIdx,
    int condCount,
    boolean condFinish
) {
    public static ActionBonusCond parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActionBonusCond(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ActionBonusCond parseFrom(java.util.List<ProtoField> fields) {
        return new ActionBonusCond(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
