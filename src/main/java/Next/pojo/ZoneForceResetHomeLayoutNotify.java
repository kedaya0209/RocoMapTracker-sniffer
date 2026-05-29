// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneForceResetHomeLayoutNotify(
    RoomLayoutInfo roomLayoutInfo
) {
    public static ZoneForceResetHomeLayoutNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneForceResetHomeLayoutNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneForceResetHomeLayoutNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneForceResetHomeLayoutNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
