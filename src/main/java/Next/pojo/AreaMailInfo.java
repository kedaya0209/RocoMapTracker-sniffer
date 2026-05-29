// Generated from mail_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AreaMailInfo(
    int uid,
    int sendTime,
    MailRecvBrief mailRecvBrief
) {
    public static AreaMailInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AreaMailInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.MailRecvBrief.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static AreaMailInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AreaMailInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.MailRecvBrief.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
