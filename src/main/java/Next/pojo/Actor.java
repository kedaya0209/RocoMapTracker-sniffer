// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record Actor(
    int intVal,
    List<Integer> intVals,
    InnerMsg innerMsg
) {
    public static Actor parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Actor(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.InnerMsg.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static Actor parseFrom(java.util.List<ProtoField> fields) {
        return new Actor(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.InnerMsg.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
