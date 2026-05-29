// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DungeonData(
    int dungeonCfgId,
    List<DungeonStageData> stages,
    List<DungeonCollectionData> collections
) {
    public static DungeonData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DungeonData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DungeonStageData::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DungeonCollectionData::parseFrom).toList()
        );
    }
    public static DungeonData parseFrom(java.util.List<ProtoField> fields) {
        return new DungeonData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DungeonStageData::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DungeonCollectionData::parseFrom).toList()
        );
    }
}
