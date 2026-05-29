// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneApplyVisitReq(
    int visitUin
) {
    public static ZoneSceneApplyVisitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneApplyVisitReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneApplyVisitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneApplyVisitReq(
            Pojos.readInt(fields, 1)
        );
    }
}
