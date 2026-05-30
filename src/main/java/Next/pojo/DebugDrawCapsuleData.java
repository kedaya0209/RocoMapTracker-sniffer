// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawCapsuleData(
    Position center,
    float halfHeight,
    float radius,
    DebugDrawRotator rotator,
    DebugDrawColor color,
    float showTime,
    int thickness
) {
    public static DebugDrawCapsuleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawCapsuleData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawRotator.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readFloat(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static DebugDrawCapsuleData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawCapsuleData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawRotator.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readFloat(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
