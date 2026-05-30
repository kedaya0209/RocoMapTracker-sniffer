// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Dungeon(
    List<DungeonData> dungeons,
    boolean needResetStage
) {
    public static ActorCompData_Dungeon parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Dungeon(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DungeonData::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
    public static ActorCompData_Dungeon parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Dungeon(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DungeonData::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
}
