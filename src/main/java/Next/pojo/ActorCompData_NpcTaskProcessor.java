// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcTaskProcessor(
    List<NpcTaskProcessData> processDataList,
    long lastTaskId
) {
    public static ActorCompData_NpcTaskProcessor parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcTaskProcessor(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcTaskProcessData::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
    public static ActorCompData_NpcTaskProcessor parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcTaskProcessor(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcTaskProcessData::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
}
