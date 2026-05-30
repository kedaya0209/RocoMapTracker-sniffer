// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneMailDeleteNotify(
    List<Long> mailGidList
) {
    public static ZoneMailDeleteNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailDeleteNotify(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ZoneMailDeleteNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailDeleteNotify(
            Pojos.readLongList(fields, 1)
        );
    }
}
