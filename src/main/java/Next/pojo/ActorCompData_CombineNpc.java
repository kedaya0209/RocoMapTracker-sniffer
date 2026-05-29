// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_CombineNpc(
    List<CombineNpcInfo> combineNpcInfo,
    List<Long> finishedCombineId
) {
    public static ActorCompData_CombineNpc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_CombineNpc(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CombineNpcInfo::parseFrom).toList(),
            Pojos.readLongList(fields, 2)
        );
    }
    public static ActorCompData_CombineNpc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_CombineNpc(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CombineNpcInfo::parseFrom).toList(),
            Pojos.readLongList(fields, 2)
        );
    }
}
