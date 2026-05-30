// Generated from com_shop.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DBShopConsumeInfo(
    int goodsType,
    int goodsId,
    int totalConsumeNum,
    List<DBShopConsumeReward> rewards
) {
    public static DBShopConsumeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DBShopConsumeInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.DBShopConsumeReward::parseFrom).toList()
        );
    }
    public static DBShopConsumeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DBShopConsumeInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.DBShopConsumeReward::parseFrom).toList()
        );
    }
}
