// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapSyncAutoTrackNpcRsp(
    RetInfo retInfo,
    WorldMapAutoTrackNpcInfo autoTrackNpcInfo
) {
    public static ZoneSceneWorldMapSyncAutoTrackNpcRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapSyncAutoTrackNpcRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapAutoTrackNpcInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldMapSyncAutoTrackNpcRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapSyncAutoTrackNpcRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapAutoTrackNpcInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
