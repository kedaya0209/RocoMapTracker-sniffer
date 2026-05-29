// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneVisitRemainCatchTimesNotify(
    int remainTimes,
    boolean isGlass
) {
    public static ZoneVisitRemainCatchTimesNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneVisitRemainCatchTimesNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneVisitRemainCatchTimesNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneVisitRemainCatchTimesNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
