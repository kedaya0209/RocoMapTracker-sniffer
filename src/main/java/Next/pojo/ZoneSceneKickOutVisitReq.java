// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneKickOutVisitReq(
    int kickOutUin
) {
    public static ZoneSceneKickOutVisitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneKickOutVisitReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneKickOutVisitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneKickOutVisitReq(
            Pojos.readInt(fields, 1)
        );
    }
}
