// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapTeleportReq(
    long entryId,
    boolean useSpecialTeleport
) {
    public static ZoneSceneWorldMapTeleportReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapTeleportReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneWorldMapTeleportReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapTeleportReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
