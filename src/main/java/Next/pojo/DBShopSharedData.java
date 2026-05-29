// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DBShopSharedData(
    List<DBGoodsGroupData> goodsGroup
) {
    public static DBShopSharedData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DBShopSharedData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DBGoodsGroupData::parseFrom).toList()
        );
    }
    public static DBShopSharedData parseFrom(java.util.List<ProtoField> fields) {
        return new DBShopSharedData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DBGoodsGroupData::parseFrom).toList()
        );
    }
}
