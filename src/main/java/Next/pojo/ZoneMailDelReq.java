// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneMailDelReq(
    List<Long> mailGidList
) {
    public static ZoneMailDelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailDelReq(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ZoneMailDelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailDelReq(
            Pojos.readLongList(fields, 1)
        );
    }
}
