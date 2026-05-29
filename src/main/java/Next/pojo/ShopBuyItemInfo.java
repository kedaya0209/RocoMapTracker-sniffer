// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ShopBuyItemInfo(
    int goodsItemNum,
    int goodsId
) {
    public static ShopBuyItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ShopBuyItemInfo(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ShopBuyItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ShopBuyItemInfo(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
