// Generated from world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapSyncAutoTrackNpcReq(
    long npcLogicId
) {
    public static ZoneSceneWorldMapSyncAutoTrackNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapSyncAutoTrackNpcReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneSceneWorldMapSyncAutoTrackNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapSyncAutoTrackNpcReq(
            Pojos.readLong(fields, 1)
        );
    }
}
