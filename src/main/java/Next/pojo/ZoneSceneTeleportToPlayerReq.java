// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeleportToPlayerReq(
    int uin,
    int teleReason
) {
    public static ZoneSceneTeleportToPlayerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeleportToPlayerReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneSceneTeleportToPlayerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeleportToPlayerReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
