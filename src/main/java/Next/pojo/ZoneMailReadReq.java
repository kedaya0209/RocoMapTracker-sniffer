// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneMailReadReq(
    List<Long> mailGidList
) {
    public static ZoneMailReadReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailReadReq(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ZoneMailReadReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailReadReq(
            Pojos.readLongList(fields, 1)
        );
    }
}
