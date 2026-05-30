// Generated from com_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NavMeshDebugDraw_NavMeshPoly(
    int flag,
    DebugDrawColor color,
    List<Position> verts
) {
    public static NavMeshDebugDraw_NavMeshPoly parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NavMeshDebugDraw_NavMeshPoly(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
    public static NavMeshDebugDraw_NavMeshPoly parseFrom(java.util.List<ProtoField> fields) {
        return new NavMeshDebugDraw_NavMeshPoly(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
}
