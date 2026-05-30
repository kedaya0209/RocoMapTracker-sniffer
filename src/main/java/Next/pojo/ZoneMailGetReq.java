// Generated from zone_mail.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMailGetReq(
    long mailGid
) {
    public static ZoneMailGetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneMailGetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetReq(
            Pojos.readLong(fields, 1)
        );
    }
}
