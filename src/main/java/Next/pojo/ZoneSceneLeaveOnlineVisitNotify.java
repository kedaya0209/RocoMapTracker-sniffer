// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneLeaveOnlineVisitNotify(
    int reason
) {
    public static ZoneSceneLeaveOnlineVisitNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneLeaveOnlineVisitNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneLeaveOnlineVisitNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneLeaveOnlineVisitNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
