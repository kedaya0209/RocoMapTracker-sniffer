// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DailyGetItemLimitlist(
    int goodsType,
    List<DailyGetItemLimitInfo> items
) {
    public static DailyGetItemLimitlist parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DailyGetItemLimitlist(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DailyGetItemLimitInfo::parseFrom).toList()
        );
    }
    public static DailyGetItemLimitlist parseFrom(java.util.List<ProtoField> fields) {
        return new DailyGetItemLimitlist(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DailyGetItemLimitInfo::parseFrom).toList()
        );
    }
}
