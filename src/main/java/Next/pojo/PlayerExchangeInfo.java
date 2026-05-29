// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerExchangeInfo(
    List<ExchangeData> exchangeData,
    int lastRefreshTime,
    List<Integer> unlockedRecipes
) {
    public static PlayerExchangeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerExchangeInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ExchangeData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static PlayerExchangeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerExchangeInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ExchangeData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
