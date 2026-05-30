// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneShopExchangeRsp(
    RetInfo retInfo,
    int shopId,
    List<ShopBuyItemInfo> goodsList,
    ShopData shopData
) {
    public static ZoneShopExchangeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneShopExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ShopBuyItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ShopData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneShopExchangeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneShopExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ShopBuyItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ShopData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
