// Generated from world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeginSyncWorldMapInfoReq(
    int worldMapEntryTypes
) {
    public static ZoneSceneBeginSyncWorldMapInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeginSyncWorldMapInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneBeginSyncWorldMapInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeginSyncWorldMapInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
