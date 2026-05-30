// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Buff(
    long maxBuffId,
    List<BuffInfo> buffInfos
) {
    public static ActorCompData_Buff parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Buff(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BuffInfo::parseFrom).toList()
        );
    }
    public static ActorCompData_Buff parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Buff(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BuffInfo::parseFrom).toList()
        );
    }
}
