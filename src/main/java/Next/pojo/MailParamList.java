// Generated from com_mail.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MailParamList(
    List<MailParamInfo> contentParamList,
    List<MailParamInfo> titleParamList
) {
    public static MailParamList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailParamList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MailParamInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailParamInfo::parseFrom).toList()
        );
    }
    public static MailParamList parseFrom(java.util.List<ProtoField> fields) {
        return new MailParamList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MailParamInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailParamInfo::parseFrom).toList()
        );
    }
}
