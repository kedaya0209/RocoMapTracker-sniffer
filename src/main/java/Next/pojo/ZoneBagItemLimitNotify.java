// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBagItemLimitNotify(
    int itemConfId,
    int num
) {
    public static ZoneBagItemLimitNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBagItemLimitNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneBagItemLimitNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBagItemLimitNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
