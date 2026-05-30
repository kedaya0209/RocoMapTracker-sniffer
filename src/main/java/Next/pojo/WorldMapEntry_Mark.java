// Generated from com_world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldMapEntry_Mark(
    int markId,
    int type,
    int worldMapCfgId,
    String name,
    boolean isTrack,
    Position pos,
    int layerId,
    int sceneId
) {
    public static WorldMapEntry_Mark parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntry_Mark(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static WorldMapEntry_Mark parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntry_Mark(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
