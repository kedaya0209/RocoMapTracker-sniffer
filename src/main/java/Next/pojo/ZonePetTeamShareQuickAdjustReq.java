// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetTeamShareQuickAdjustReq(
    List<ZonePetTeamShareQuickAdjustReq_ExchangeInfo> exchangeInfo,
    List<ZonePetTeamShareQuickAdjustReq_BagItemInfo> itemInfo
) {
    public static ZonePetTeamShareQuickAdjustReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTeamShareQuickAdjustReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZonePetTeamShareQuickAdjustReq_ExchangeInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePetTeamShareQuickAdjustReq_BagItemInfo::parseFrom).toList()
        );
    }
    public static ZonePetTeamShareQuickAdjustReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTeamShareQuickAdjustReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZonePetTeamShareQuickAdjustReq_ExchangeInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePetTeamShareQuickAdjustReq_BagItemInfo::parseFrom).toList()
        );
    }
}
