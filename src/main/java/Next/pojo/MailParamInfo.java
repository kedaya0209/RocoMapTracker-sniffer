// Generated from com_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MailParamInfo(
    int key,
    byte[] value
) {
    public static MailParamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailParamInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static MailParamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MailParamInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
