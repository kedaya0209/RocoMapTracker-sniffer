// Generated from com_world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WorldMapEntry_Task(
    int taskId,
    List<Position> pos
) {
    public static WorldMapEntry_Task parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntry_Task(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
    public static WorldMapEntry_Task parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntry_Task(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
}
