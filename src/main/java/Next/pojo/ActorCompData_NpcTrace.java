// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcTrace(
    List<NpcTraceData> npcTraceDatas,
    NpcTraceQueryInfo queryInfo
) {
    public static ActorCompData_NpcTrace parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcTrace(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcTraceData::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NpcTraceQueryInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ActorCompData_NpcTrace parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcTrace(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcTraceData::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NpcTraceQueryInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
