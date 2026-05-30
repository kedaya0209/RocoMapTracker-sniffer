// Generated from world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapInfoChangedNty(
    WorldMapEntries changedEntries
) {
    public static ZoneSceneWorldMapInfoChangedNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapInfoChangedNty(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldMapInfoChangedNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapInfoChangedNty(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
