// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneDailyLimitNotify(
    byte[] tips,
    int hour
) {
    public static ZoneDailyLimitNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneDailyLimitNotify(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneDailyLimitNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneDailyLimitNotify(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
