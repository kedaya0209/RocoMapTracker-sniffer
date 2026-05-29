// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneMailGetAttachmentRsp(
    RetInfo retInfo,
    List<MailRecvBrief> mailBrief,
    long version,
    List<ZoneMailGetAttachmentRsp_GetFailGoodsInfo> getFailGoods
) {
    public static ZoneMailGetAttachmentRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetAttachmentRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailRecvBrief::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneMailGetAttachmentRsp_GetFailGoodsInfo::parseFrom).toList()
        );
    }
    public static ZoneMailGetAttachmentRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetAttachmentRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailRecvBrief::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneMailGetAttachmentRsp_GetFailGoodsInfo::parseFrom).toList()
        );
    }
}
