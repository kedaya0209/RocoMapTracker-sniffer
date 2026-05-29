// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DBShop(
    List<DBShopOne> shops,
    MonthCardData monthCard,
    long seq,
    DBShopSharedData sharedData
) {
    public static DBShop parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DBShop(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DBShopOne::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MonthCardData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DBShopSharedData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static DBShop parseFrom(java.util.List<ProtoField> fields) {
        return new DBShop(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DBShopOne::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MonthCardData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DBShopSharedData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
