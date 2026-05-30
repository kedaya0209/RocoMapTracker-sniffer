// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GiftDropWeithBagNumInfo(
    int idType,
    List<GiftDropWeightBagNumItem> items
) {
    public static GiftDropWeithBagNumInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GiftDropWeithBagNumInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GiftDropWeightBagNumItem::parseFrom).toList()
        );
    }
    public static GiftDropWeithBagNumInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GiftDropWeithBagNumInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GiftDropWeightBagNumItem::parseFrom).toList()
        );
    }
}
