// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneMailReadRsp(
    RetInfo retInfo,
    List<Long> mailGidList,
    long version
) {
    public static ZoneMailReadRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailReadRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneMailReadRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailReadRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
