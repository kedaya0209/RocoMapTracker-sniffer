// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcPendant(
    int pendantCfgId,
    boolean enabled,
    List<NpcPendantItemInfo> pendantItemInfos
) {
    public static ActorInfo_NpcPendant parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcPendant(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.NpcPendantItemInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_NpcPendant parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcPendant(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.NpcPendantItemInfo::parseFrom).toList()
        );
    }
}
