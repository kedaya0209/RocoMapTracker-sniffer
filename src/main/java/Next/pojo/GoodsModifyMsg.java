// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GoodsModifyMsg(
    boolean needCheckBeforAdd,
    List<GoodsItem> goodsList,
    int flowReason,
    boolean needNotify,
    boolean isNotMerge,
    List<Integer> addGoodsParams,
    int displayTag,
    int tlogParam
) {
    public static GoodsModifyMsg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsModifyMsg(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GoodsItem::parseFrom).toList(),
            Pojos.readInt(fields, 3, 0),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static GoodsModifyMsg parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsModifyMsg(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GoodsItem::parseFrom).toList(),
            Pojos.readInt(fields, 3, 0),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
