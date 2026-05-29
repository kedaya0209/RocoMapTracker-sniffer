// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceBaseData(
    long spaceTimeMs,
    long operatorObjId,
    long mask
) {
    public static SpaceBaseData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceBaseData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static SpaceBaseData parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceBaseData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
