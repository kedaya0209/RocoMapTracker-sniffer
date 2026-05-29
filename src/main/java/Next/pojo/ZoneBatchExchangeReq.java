// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBatchExchangeReq(
    List<CSExchangeItem> exchangeItems
) {
    public static ZoneBatchExchangeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBatchExchangeReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CSExchangeItem::parseFrom).toList()
        );
    }
    public static ZoneBatchExchangeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBatchExchangeReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CSExchangeItem::parseFrom).toList()
        );
    }
}
