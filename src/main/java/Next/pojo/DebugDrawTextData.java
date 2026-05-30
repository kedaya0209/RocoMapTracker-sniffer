// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawTextData(
    Position pos,
    byte[] text,
    DebugDrawColor color,
    float showTime
) {
    public static DebugDrawTextData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawTextData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4)
        );
    }
    public static DebugDrawTextData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawTextData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4)
        );
    }
}
