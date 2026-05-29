// Generated from mail_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MailInfoList(
    int uin,
    List<MailInfo> mails,
    List<byte[]> byteMails
) {
    public static MailInfoList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailInfoList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailInfo::parseFrom).toList(),
            Pojos.readBytesList(fields, 3)
        );
    }
    public static MailInfoList parseFrom(java.util.List<ProtoField> fields) {
        return new MailInfoList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MailInfo::parseFrom).toList(),
            Pojos.readBytesList(fields, 3)
        );
    }
}
