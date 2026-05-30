// Generated from com_goods.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GoodsChange(
    List<GoodsChangeItem> changes,
    long petDataVesion,
    long bagDataVesion,
    long mailDataVesion
) {
    public static GoodsChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsChange(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GoodsChangeItem::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static GoodsChange parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsChange(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GoodsChangeItem::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
