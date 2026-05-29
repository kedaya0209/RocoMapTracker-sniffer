// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerTransformStatusParams(
    int transformCfgId,
    int emoteId,
    int cancelReason
) {
    public static PlayerTransformStatusParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTransformStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static PlayerTransformStatusParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTransformStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
