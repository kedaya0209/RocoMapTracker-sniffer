// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneUseMultiBagItemReq(
    List<ZoneUseMultiBagItemReq_BagItemInfo> itemInfo
) {
    public static ZoneUseMultiBagItemReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUseMultiBagItemReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneUseMultiBagItemReq_BagItemInfo::parseFrom).toList()
        );
    }
    public static ZoneUseMultiBagItemReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUseMultiBagItemReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneUseMultiBagItemReq_BagItemInfo::parseFrom).toList()
        );
    }
}
