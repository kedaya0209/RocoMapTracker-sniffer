// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeginSyncWorldMapInfoRsp(
    RetInfo retInfo,
    WorldMapEntries entries
) {
    public static ZoneSceneBeginSyncWorldMapInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeginSyncWorldMapInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneBeginSyncWorldMapInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeginSyncWorldMapInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
