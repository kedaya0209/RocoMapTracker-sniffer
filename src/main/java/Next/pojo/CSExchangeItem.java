// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CSExchangeItem(
    int id,
    int num,
    List<CSExchangeItem_Goods> costGoods
) {
    public static CSExchangeItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CSExchangeItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CSExchangeItem_Goods::parseFrom).toList()
        );
    }
    public static CSExchangeItem parseFrom(java.util.List<ProtoField> fields) {
        return new CSExchangeItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CSExchangeItem_Goods::parseFrom).toList()
        );
    }
}
