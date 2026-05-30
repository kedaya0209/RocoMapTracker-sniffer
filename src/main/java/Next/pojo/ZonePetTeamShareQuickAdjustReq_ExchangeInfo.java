// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetTeamShareQuickAdjustReq_ExchangeInfo(
    int exchangeId,
    int exchangeNum,
    List<Integer> costGoodsId
) {
    public static ZonePetTeamShareQuickAdjustReq_ExchangeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTeamShareQuickAdjustReq_ExchangeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZonePetTeamShareQuickAdjustReq_ExchangeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTeamShareQuickAdjustReq_ExchangeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
