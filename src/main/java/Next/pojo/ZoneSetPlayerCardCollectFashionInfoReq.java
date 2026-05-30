// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetPlayerCardCollectFashionInfoReq(
    int cardModuleId,
    List<PlayerCardBriefInfo_CollectFashionInfo> collectFashionInfo
) {
    public static ZoneSetPlayerCardCollectFashionInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerCardCollectFashionInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerCardBriefInfo_CollectFashionInfo::parseFrom).toList()
        );
    }
    public static ZoneSetPlayerCardCollectFashionInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerCardCollectFashionInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerCardBriefInfo_CollectFashionInfo::parseFrom).toList()
        );
    }
}
