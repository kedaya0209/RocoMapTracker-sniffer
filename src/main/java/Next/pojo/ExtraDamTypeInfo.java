// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ExtraDamTypeInfo(
    List<Integer> values,
    int source
) {
    public static ExtraDamTypeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ExtraDamTypeInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ExtraDamTypeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ExtraDamTypeInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
