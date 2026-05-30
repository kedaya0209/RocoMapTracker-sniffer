// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record VisitorOnly_NpcOptionInfo(
    long visitorId,
    List<ActorInfo_NpcOptionInfo> optionInfos
) {
    public static VisitorOnly_NpcOptionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisitorOnly_NpcOptionInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActorInfo_NpcOptionInfo::parseFrom).toList()
        );
    }
    public static VisitorOnly_NpcOptionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new VisitorOnly_NpcOptionInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActorInfo_NpcOptionInfo::parseFrom).toList()
        );
    }
}
