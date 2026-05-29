// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Navigator(
    List<AffectNavDynamicNpcData> affectNavDynamicNpcDatas
) {
    public static ActorCompData_Navigator parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Navigator(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AffectNavDynamicNpcData::parseFrom).toList()
        );
    }
    public static ActorCompData_Navigator parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Navigator(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AffectNavDynamicNpcData::parseFrom).toList()
        );
    }
}
