// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeAccessInfoNotify(
    HomeAccessInfo accessInfo
) {
    public static ZoneHomeAccessInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeAccessInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeAccessInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneHomeAccessInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeAccessInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeAccessInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
