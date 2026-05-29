// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ShopData(
    int id,
    ShopData_ConsumeInfo consumeInfo,
    List<GoodsData> goodsData,
    List<Integer> randomShopShownIndexes,
    int maxRefreshCount,
    int refreshCount,
    long version,
    long disableTime
) {
    public static ShopData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ShopData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ShopData_ConsumeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.GoodsData::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10)
        );
    }
    public static ShopData parseFrom(java.util.List<ProtoField> fields) {
        return new ShopData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ShopData_ConsumeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.GoodsData::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10)
        );
    }
}
