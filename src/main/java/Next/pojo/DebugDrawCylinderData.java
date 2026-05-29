// Generated from scene_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawCylinderData(
    Position centerPos,
    int halfHeight,
    int radius,
    int segments,
    DebugDrawColor color,
    float showTime,
    int thickness
) {
    public static DebugDrawCylinderData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawCylinderData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readFloat(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static DebugDrawCylinderData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawCylinderData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readFloat(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
