// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BeginActResult(
    int actionType,
    List<Integer> actionResultParams
) {
    public static BeginActResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BeginActResult(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static BeginActResult parseFrom(java.util.List<ProtoField> fields) {
        return new BeginActResult(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
