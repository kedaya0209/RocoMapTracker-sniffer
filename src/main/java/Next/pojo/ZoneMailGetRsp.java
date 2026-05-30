// Generated from zone_mail.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneMailGetRsp(
    RetInfo retInfo,
    List<MailInfo> mailInfo,
    long version
) {
    public static ZoneMailGetRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneMailGetRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3)
        );
    }
}
