// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NavMeshDebugDraw_NavMeshBoundary(
    Position beginPos,
    Position endPos
) {
    public static NavMeshDebugDraw_NavMeshBoundary parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NavMeshDebugDraw_NavMeshBoundary(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static NavMeshDebugDraw_NavMeshBoundary parseFrom(java.util.List<ProtoField> fields) {
        return new NavMeshDebugDraw_NavMeshBoundary(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
