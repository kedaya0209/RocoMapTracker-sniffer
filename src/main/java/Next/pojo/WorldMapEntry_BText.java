// Generated from com_world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WorldMapEntry_BText(
    int worldMapCfgId,
    List<WorldMapPetInfo> petInfos
) {
    public static WorldMapEntry_BText parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntry_BText(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapPetInfo::parseFrom).toList()
        );
    }
    public static WorldMapEntry_BText parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntry_BText(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapPetInfo::parseFrom).toList()
        );
    }
}
