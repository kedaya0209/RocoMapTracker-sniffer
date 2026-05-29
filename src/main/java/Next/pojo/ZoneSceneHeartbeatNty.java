// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHeartbeatNty(
    long heartbeatSeq,
    int serverLogicTickIvl
) {
    public static ZoneSceneHeartbeatNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHeartbeatNty(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneSceneHeartbeatNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHeartbeatNty(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 6)
        );
    }
}
