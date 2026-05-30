// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawBoxData(
    Position center,
    Position extent,
    DebugDrawColor color,
    DebugDrawRotator rotator,
    float showTime,
    int thickness
) {
    public static DebugDrawBoxData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawBoxData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawRotator.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static DebugDrawBoxData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawBoxData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawRotator.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
