// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcInstantiator(
    List<Long> permanentNpcList,
    List<PermanentNpcInfo> permanentNpcs
) {
    public static ActorCompData_NpcInstantiator parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcInstantiator(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PermanentNpcInfo::parseFrom).toList()
        );
    }
    public static ActorCompData_NpcInstantiator parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcInstantiator(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PermanentNpcInfo::parseFrom).toList()
        );
    }
}
