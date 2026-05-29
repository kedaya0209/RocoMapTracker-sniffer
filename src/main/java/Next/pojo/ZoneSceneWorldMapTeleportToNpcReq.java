// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapTeleportToNpcReq(
    long npcObjId
) {
    public static ZoneSceneWorldMapTeleportToNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapTeleportToNpcReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneSceneWorldMapTeleportToNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapTeleportToNpcReq(
            Pojos.readLong(fields, 1)
        );
    }
}
