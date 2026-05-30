// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawCircleData(
    Position centerPos,
    int radius,
    int segments,
    DebugDrawColor color,
    float showTime,
    int thickness
) {
    public static DebugDrawCircleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawCircleData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static DebugDrawCircleData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawCircleData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
