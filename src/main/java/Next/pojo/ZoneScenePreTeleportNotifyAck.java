// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePreTeleportNotifyAck(
    String teleportStub
) {
    public static ZoneScenePreTeleportNotifyAck parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePreTeleportNotifyAck(
            Pojos.readString(fields, 5)
        );
    }
    public static ZoneScenePreTeleportNotifyAck parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePreTeleportNotifyAck(
            Pojos.readString(fields, 5)
        );
    }
}
