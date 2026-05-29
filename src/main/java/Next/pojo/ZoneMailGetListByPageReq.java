// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMailGetListByPageReq(
    int page,
    long version
) {
    public static ZoneMailGetListByPageReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetListByPageReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneMailGetListByPageReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetListByPageReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
