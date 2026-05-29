// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActivityPartData(
    int partId,
    boolean allCondFinish
) {
    public static ActivityPartData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityPartData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ActivityPartData parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityPartData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
