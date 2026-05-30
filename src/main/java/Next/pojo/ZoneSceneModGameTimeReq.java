// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneModGameTimeReq(
    boolean pause,
    int addiTime,
    long timeStamp,
    long npcId,
    int minigameCfgId
) {
    public static ZoneSceneModGameTimeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneModGameTimeReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneSceneModGameTimeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneModGameTimeReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
