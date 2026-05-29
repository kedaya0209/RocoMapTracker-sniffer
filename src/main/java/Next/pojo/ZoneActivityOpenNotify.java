// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneActivityOpenNotify(
    int activityId
) {
    public static ZoneActivityOpenNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivityOpenNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneActivityOpenNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivityOpenNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
