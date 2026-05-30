// Generated from com_world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldMapEntry(
    int entryType,
    long entryId,
    WorldMapEntry_WorldMapEntry_MySelf myselfEntryInfo,
    WorldMapEntry_BText btextEntryInfo,
    WorldMapEntry_Npc npcEntryInfo,
    WorldMapEntry_Area areaEntryInfo,
    WorldMapEntry_SceneEvent sceneEvent,
    WorldMapEntry_Task taskEntryInfo,
    WorldMapEntry_Mark markEntryInfo
) {
    public static WorldMapEntry parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntry(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.WorldMapEntry_WorldMapEntry_MySelf.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.WorldMapEntry_BText.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.WorldMapEntry_Npc.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.WorldMapEntry_Area.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.WorldMapEntry_SceneEvent.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.WorldMapEntry_Task.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.WorldMapEntry_Mark.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
    public static WorldMapEntry parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntry(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.WorldMapEntry_WorldMapEntry_MySelf.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.WorldMapEntry_BText.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.WorldMapEntry_Npc.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.WorldMapEntry_Area.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.WorldMapEntry_SceneEvent.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.WorldMapEntry_Task.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.WorldMapEntry_Mark.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
}
