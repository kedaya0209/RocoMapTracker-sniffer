// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneIgnoreC2SCmdNotify(
    int cmdId
) {
    public static ZoneIgnoreC2SCmdNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneIgnoreC2SCmdNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneIgnoreC2SCmdNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneIgnoreC2SCmdNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
