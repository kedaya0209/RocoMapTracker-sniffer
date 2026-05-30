// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcPendantMgr(
    List<NpcPendantInfo> pendantInfos
) {
    public static ActorCompData_NpcPendantMgr parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcPendantMgr(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcPendantInfo::parseFrom).toList()
        );
    }
    public static ActorCompData_NpcPendantMgr parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcPendantMgr(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcPendantInfo::parseFrom).toList()
        );
    }
}
