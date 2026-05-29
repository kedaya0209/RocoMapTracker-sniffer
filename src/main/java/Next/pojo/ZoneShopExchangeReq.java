// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneShopExchangeReq(
    int shopId,
    List<ShopBuyItemInfo> goodsList,
    int contentId,
    long version
) {
    public static ZoneShopExchangeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneShopExchangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ShopBuyItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static ZoneShopExchangeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneShopExchangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ShopBuyItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
