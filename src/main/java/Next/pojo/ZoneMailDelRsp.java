// Generated from zone_mail.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneMailDelRsp(
    RetInfo retInfo,
    List<Long> mailGidList,
    long version
) {
    public static ZoneMailDelRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailDelRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneMailDelRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailDelRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
