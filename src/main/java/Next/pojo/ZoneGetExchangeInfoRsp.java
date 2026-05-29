// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetExchangeInfoRsp(
    RetInfo retInfo,
    List<ZoneGetExchangeInfoRsp_Exchange> exchangeList
) {
    public static ZoneGetExchangeInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetExchangeInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneGetExchangeInfoRsp_Exchange::parseFrom).toList()
        );
    }
    public static ZoneGetExchangeInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetExchangeInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneGetExchangeInfoRsp_Exchange::parseFrom).toList()
        );
    }
}
