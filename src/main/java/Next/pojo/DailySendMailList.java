// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DailySendMailList(
    List<DailySendMailInfo> items
) {
    public static DailySendMailList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DailySendMailList(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DailySendMailInfo::parseFrom).toList()
        );
    }
    public static DailySendMailList parseFrom(java.util.List<ProtoField> fields) {
        return new DailySendMailList(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DailySendMailInfo::parseFrom).toList()
        );
    }
}
