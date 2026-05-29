// Generated from scene_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawRotator(
    float x,
    float y,
    float z,
    float w
) {
    public static DebugDrawRotator parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawRotator(
            Pojos.readFloat(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
    public static DebugDrawRotator parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawRotator(
            Pojos.readFloat(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
}
