// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DBShopOne(
    int id,
    long version,
    List<DBShopGoods> goodsList,
    List<Integer> randomShopShownIndexes,
    long lastRefreshTime,
    int maxRefreshCount,
    int refreshCount,
    DBShopConsumeInfo accConsume,
    List<DBGoodsGroupData> goodsGroup
) {
    public static DBShopOne parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DBShopOne(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DBShopGoods::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DBShopConsumeInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.DBGoodsGroupData::parseFrom).toList()
        );
    }
    public static DBShopOne parseFrom(java.util.List<ProtoField> fields) {
        return new DBShopOne(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DBShopGoods::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DBShopConsumeInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.DBGoodsGroupData::parseFrom).toList()
        );
    }
}
