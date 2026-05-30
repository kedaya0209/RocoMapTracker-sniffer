// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneCancelPreTeleportNotify(
    String teleportStub,
    int errCode
) {
    public static ZoneSceneCancelPreTeleportNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneCancelPreTeleportNotify(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneCancelPreTeleportNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneCancelPreTeleportNotify(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
