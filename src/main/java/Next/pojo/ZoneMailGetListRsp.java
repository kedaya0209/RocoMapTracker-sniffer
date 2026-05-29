// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMailGetListRsp(
    RetInfo retInfo,
    MailInfoList mailList
) {
    public static ZoneMailGetListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.MailInfoList.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneMailGetListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.MailInfoList.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
