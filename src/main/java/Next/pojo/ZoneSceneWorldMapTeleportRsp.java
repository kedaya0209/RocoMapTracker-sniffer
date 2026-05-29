// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapTeleportRsp(
    RetInfo retInfo,
    long entryId,
    Point targetPt
) {
    public static ZoneSceneWorldMapTeleportRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapTeleportRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
    public static ZoneSceneWorldMapTeleportRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapTeleportRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
}
