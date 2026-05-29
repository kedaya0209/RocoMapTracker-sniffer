// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_AuraMgr(
    long maxAuraId,
    List<AuraInfo> auraInfos
) {
    public static ActorCompData_AuraMgr parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_AuraMgr(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.AuraInfo::parseFrom).toList()
        );
    }
    public static ActorCompData_AuraMgr parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_AuraMgr(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.AuraInfo::parseFrom).toList()
        );
    }
}
