// Generated from com_shop.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DBShopGoods(
    int id,
    int buyNum,
    long lastRefreshTime,
    long nextRefreshTime
) {
    public static DBShopGoods parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DBShopGoods(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static DBShopGoods parseFrom(java.util.List<ProtoField> fields) {
        return new DBShopGoods(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
