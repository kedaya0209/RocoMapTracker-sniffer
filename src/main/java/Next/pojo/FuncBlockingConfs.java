// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FuncBlockingConfs(
    int funcType,
    List<FuncBlockingConfItem> funcConfs,
    List<FuncBlockingChannelConfItem> channelConfs
) {
    public static FuncBlockingConfs parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FuncBlockingConfs(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FuncBlockingConfItem::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FuncBlockingChannelConfItem::parseFrom).toList()
        );
    }
    public static FuncBlockingConfs parseFrom(java.util.List<ProtoField> fields) {
        return new FuncBlockingConfs(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FuncBlockingConfItem::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FuncBlockingChannelConfItem::parseFrom).toList()
        );
    }
}
