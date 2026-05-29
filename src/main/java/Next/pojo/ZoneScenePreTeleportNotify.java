// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePreTeleportNotify(
    int fromSceneResCfgId,
    int toSceneCfgId,
    int toSceneResCfgId,
    long toSceneInstId,
    Point toPt,
    String teleportStub,
    int teleportId,
    boolean allowCliCachePkg,
    boolean isNoLoadingTeleport
) {
    public static ZoneScenePreTeleportNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePreTeleportNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readString(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readBool(fields, 26),
            Pojos.readBool(fields, 27)
        );
    }
    public static ZoneScenePreTeleportNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePreTeleportNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readString(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readBool(fields, 26),
            Pojos.readBool(fields, 27)
        );
    }
}
