// Generated from com_world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WorldMapEntries(
    List<WorldMapEntry> entryInfos
) {
    public static WorldMapEntries parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntries(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.WorldMapEntry::parseFrom).toList()
        );
    }
    public static WorldMapEntries parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntries(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.WorldMapEntry::parseFrom).toList()
        );
    }
}
