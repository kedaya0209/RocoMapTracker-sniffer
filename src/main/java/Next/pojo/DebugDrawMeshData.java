// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DebugDrawMeshData(
    List<Position> verts,
    List<Integer> indices,
    DebugDrawColor color,
    float showTime
) {
    public static DebugDrawMeshData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawMeshData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4)
        );
    }
    public static DebugDrawMeshData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawMeshData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4)
        );
    }
}
