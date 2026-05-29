// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMailGetAttachmentReq(
    long mailGid,
    ClientTokenInfo tokenInfo
) {
    public static ZoneMailGetAttachmentReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetAttachmentReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ClientTokenInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneMailGetAttachmentReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetAttachmentReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ClientTokenInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
