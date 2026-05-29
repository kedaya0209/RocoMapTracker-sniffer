// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CreatureAttrs_ComplexAttr64(
    int type,
    long val,
    long base,
    long totalAddiAmend,
    List<Long> addiAmends,
    int totalMulAmend,
    List<Integer> mulAmends
) {
    public static CreatureAttrs_ComplexAttr64 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CreatureAttrs_ComplexAttr64(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLongList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
    public static CreatureAttrs_ComplexAttr64 parseFrom(java.util.List<ProtoField> fields) {
        return new CreatureAttrs_ComplexAttr64(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLongList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
}
