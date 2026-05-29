// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetShareFormInfoRsp(
    RetInfo retInfo,
    List<ShareFormItem> shareFormItem
) {
    public static ZoneGetShareFormInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetShareFormInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ShareFormItem::parseFrom).toList()
        );
    }
    public static ZoneGetShareFormInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetShareFormInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ShareFormItem::parseFrom).toList()
        );
    }
}
