// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHeartbeatResultNty(
    RetInfo retInfo,
    long heartbeatSeq,
    long serverTime,
    int transDelayTime,
    int avgTransDelayTime,
    long serverLogicFrame,
    String passData
) {
    public static ZoneSceneHeartbeatResultNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHeartbeatResultNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 13),
            Pojos.readString(fields, 16)
        );
    }
    public static ZoneSceneHeartbeatResultNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHeartbeatResultNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 13),
            Pojos.readString(fields, 16)
        );
    }
}
