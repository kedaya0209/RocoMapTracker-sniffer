// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneModifyBagItemFlagsReq(
    List<ZoneModifyBagItemFlagsReq_ModifyInfo> modifyInfo
) {
    public static ZoneModifyBagItemFlagsReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneModifyBagItemFlagsReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneModifyBagItemFlagsReq_ModifyInfo::parseFrom).toList()
        );
    }
    public static ZoneModifyBagItemFlagsReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneModifyBagItemFlagsReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneModifyBagItemFlagsReq_ModifyInfo::parseFrom).toList()
        );
    }
}
