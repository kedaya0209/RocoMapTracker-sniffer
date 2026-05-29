// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerInteractInfo(
    List<HistoricalInteractInfo> historicalExchangeEggInfos,
    List<HistoricalInteractInfo> historicalSparringInfos
) {
    public static PlayerInteractInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerInteractInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HistoricalInteractInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HistoricalInteractInfo::parseFrom).toList()
        );
    }
    public static PlayerInteractInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerInteractInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HistoricalInteractInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HistoricalInteractInfo::parseFrom).toList()
        );
    }
}
