// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HighValuePetLayEggRecord(
    int gid,
    long nextCdTime
) {
    public static HighValuePetLayEggRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HighValuePetLayEggRecord(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static HighValuePetLayEggRecord parseFrom(java.util.List<ProtoField> fields) {
        return new HighValuePetLayEggRecord(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
