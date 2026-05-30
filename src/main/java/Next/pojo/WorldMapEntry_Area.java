// Generated from com_world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldMapEntry_Area(
    int worldMapCfgId,
    boolean haveExplored
) {
    public static WorldMapEntry_Area parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntry_Area(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static WorldMapEntry_Area parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntry_Area(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
