// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NavMeshDebugDraw(
    List<NavMeshDebugDraw_NavMeshTile> tiles
) {
    public static NavMeshDebugDraw parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NavMeshDebugDraw(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshTile::parseFrom).toList()
        );
    }
    public static NavMeshDebugDraw parseFrom(java.util.List<ProtoField> fields) {
        return new NavMeshDebugDraw(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NavMeshDebugDraw_NavMeshTile::parseFrom).toList()
        );
    }
}
