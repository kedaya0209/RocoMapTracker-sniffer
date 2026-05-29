// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GoodsReward(
    List<GoodsItem> rewards
) {
    public static GoodsReward parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsReward(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GoodsItem::parseFrom).toList()
        );
    }
    public static GoodsReward parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsReward(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GoodsItem::parseFrom).toList()
        );
    }
}
