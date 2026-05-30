// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DailySendMailInfo(
    int type,
    List<DailySendMailItem> items
) {
    public static DailySendMailInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DailySendMailInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DailySendMailItem::parseFrom).toList()
        );
    }
    public static DailySendMailInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DailySendMailInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DailySendMailItem::parseFrom).toList()
        );
    }
}
