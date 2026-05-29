// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetUnlockedExchangeRsp(
    RetInfo retInfo,
    CSUnlockedExchangeRecipe recipes,
    List<ZoneGetExchangeInfoRsp_Exchange> exchangeList
) {
    public static ZoneGetUnlockedExchangeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetUnlockedExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CSUnlockedExchangeRecipe.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneGetExchangeInfoRsp_Exchange::parseFrom).toList()
        );
    }
    public static ZoneGetUnlockedExchangeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetUnlockedExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CSUnlockedExchangeRecipe.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneGetExchangeInfoRsp_Exchange::parseFrom).toList()
        );
    }
}
