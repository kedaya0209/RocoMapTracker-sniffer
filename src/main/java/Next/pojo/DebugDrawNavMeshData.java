// Generated from scene_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DebugDrawNavMeshData(
    NavMeshDebugDraw rawData,
    int innerLineThickness,
    int outerLineThickness,
    float showTime
) {
    public static DebugDrawNavMeshData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawNavMeshData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.NavMeshDebugDraw.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
    public static DebugDrawNavMeshData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawNavMeshData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.NavMeshDebugDraw.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
}
