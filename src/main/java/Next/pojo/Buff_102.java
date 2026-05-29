// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record Buff_102(
    int petId,
    List<Integer> oldBaseIds
) {
    public static Buff_102 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Buff_102(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static Buff_102 parseFrom(java.util.List<ProtoField> fields) {
        return new Buff_102(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
