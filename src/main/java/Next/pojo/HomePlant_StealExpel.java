// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomePlant_StealExpel(
    long avatarId,
    int expelTime
) {
    public static HomePlant_StealExpel parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePlant_StealExpel(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static HomePlant_StealExpel parseFrom(java.util.List<ProtoField> fields) {
        return new HomePlant_StealExpel(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
