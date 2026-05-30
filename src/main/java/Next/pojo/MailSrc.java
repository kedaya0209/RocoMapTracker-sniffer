// Generated from mail_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MailSrc(
    int uin,
    byte[] name,
    OssReason ossReason,
    boolean hasJump
) {
    public static MailSrc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailSrc(
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.OssReason.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 6)
        );
    }
    public static MailSrc parseFrom(java.util.List<ProtoField> fields) {
        return new MailSrc(
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.OssReason.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 6)
        );
    }
}
