// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_NpcCamp(
    int level
) {
    public static ActorCompData_NpcCamp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcCamp(
            Pojos.readInt(fields, 2)
        );
    }
    public static ActorCompData_NpcCamp parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcCamp(
            Pojos.readInt(fields, 2)
        );
    }
}
