// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawPointData(
    Position pointPos,
    int pointSize,
    DebugDrawColor color,
    float showTime
) {
    public static DebugDrawPointData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawPointData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4)
        );
    }
    public static DebugDrawPointData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawPointData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4)
        );
    }
}
