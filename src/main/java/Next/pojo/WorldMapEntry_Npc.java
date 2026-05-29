// Generated from com_world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WorldMapEntry_Npc(
    int worldMapCfgId,
    List<WorldMapNpcInfo> worldMapNpcInfos,
    int nextNpcRefreshTime,
    Position pos,
    GlassInfo glassInfo,
    int mutationType
) {
    public static WorldMapEntry_Npc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntry_Npc(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapNpcInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6)
        );
    }
    public static WorldMapEntry_Npc parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntry_Npc(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapNpcInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6)
        );
    }
}
