// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CreatureAttrs_ComplexAttr32(
    int val,
    int base,
    int totalAddiAmend,
    List<Integer> addiAmends,
    int totalMulAmend,
    List<Integer> mulAmends
) {
    public static CreatureAttrs_ComplexAttr32 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CreatureAttrs_ComplexAttr32(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
    public static CreatureAttrs_ComplexAttr32 parseFrom(java.util.List<ProtoField> fields) {
        return new CreatureAttrs_ComplexAttr32(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
}
