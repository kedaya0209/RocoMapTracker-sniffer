// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeInfoChangeNotify(
    boolean isHomeVisiting,
    int homeOwnerUin,
    boolean isOnlineVisitingHome
) {
    public static ZoneHomeInfoChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeInfoChangeNotify(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneHomeInfoChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeInfoChangeNotify(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
