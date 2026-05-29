// Generated from com_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MailFailInfo(
    MailRecvBrief briefInfo,
    int failNum
) {
    public static MailFailInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailFailInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.MailRecvBrief.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static MailFailInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MailFailInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.MailRecvBrief.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
