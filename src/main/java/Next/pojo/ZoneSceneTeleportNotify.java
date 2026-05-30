// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeleportNotify(
    int fromSceneCfgId,
    int fromSceneResCfgId,
    long fromSceneInstId,
    Point fromPt,
    int toSceneCfgId,
    int toSceneResCfgId,
    long toSceneInstId,
    Point toPt,
    ActorInfo selfInfo,
    int teleportReason,
    int teleportId,
    int teleportRuleId,
    int homeRoomLevel,
    byte[] homeName
) {
    public static ZoneSceneTeleportNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeleportNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.ActorInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 31),
            Pojos.readBytes(fields, 32)
        );
    }
    public static ZoneSceneTeleportNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeleportNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.ActorInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 31),
            Pojos.readBytes(fields, 32)
        );
    }
}
