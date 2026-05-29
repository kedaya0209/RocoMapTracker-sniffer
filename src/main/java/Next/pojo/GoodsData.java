// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GoodsData(
    int goodsId,
    int buyNum,
    long nextRefreshTime,
    GoodsPrice originPrice,
    GoodsPrice realPrice,
    int limitBuyNum,
    long disableTime,
    List<SubGoodsData> subGoods
) {
    public static GoodsData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsData(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.GoodsPrice.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.GoodsPrice.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 12),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.SubGoodsData::parseFrom).toList()
        );
    }
    public static GoodsData parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsData(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.GoodsPrice.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.GoodsPrice.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 12),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.SubGoodsData::parseFrom).toList()
        );
    }
}
