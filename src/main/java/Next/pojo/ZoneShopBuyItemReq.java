// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneShopBuyItemReq(
    List<ShopBuyItemInfo> buyItemInfo,
    int shopId,
    int contentId,
    long version
) {
    public static ZoneShopBuyItemReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneShopBuyItemReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ShopBuyItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static ZoneShopBuyItemReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneShopBuyItemReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ShopBuyItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
