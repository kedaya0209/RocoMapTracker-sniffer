// Generated from com_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NavMeshDebugDraw_NavMeshTile(
    List<NavMeshDebugDraw_NavMeshPoly> polys,
    List<NavMeshDebugDraw_NavMeshBoundary> innerBoundaries,
    DebugDrawColor innerColor,
    List<NavMeshDebugDraw_NavMeshBoundary> outerBoundaries,
    DebugDrawColor outerColor
) {
    public static NavMeshDebugDraw_NavMeshTile parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NavMeshDebugDraw_NavMeshTile(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshPoly::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshBoundary::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshBoundary::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static NavMeshDebugDraw_NavMeshTile parseFrom(java.util.List<ProtoField> fields) {
        return new NavMeshDebugDraw_NavMeshTile(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshPoly::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshBoundary::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshBoundary::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
