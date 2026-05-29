// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapTeleportToPlayerReq(
    int uin
) {
    public static ZoneSceneWorldMapTeleportToPlayerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapTeleportToPlayerReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneWorldMapTeleportToPlayerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapTeleportToPlayerReq(
            Pojos.readInt(fields, 1)
        );
    }
}
