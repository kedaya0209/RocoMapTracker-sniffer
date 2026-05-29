// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_Temperature(
    long reduceHpAuraId
) {
    public static ActorCompData_Temperature parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Temperature(
            Pojos.readLong(fields, 1)
        );
    }
    public static ActorCompData_Temperature parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Temperature(
            Pojos.readLong(fields, 1)
        );
    }
}
