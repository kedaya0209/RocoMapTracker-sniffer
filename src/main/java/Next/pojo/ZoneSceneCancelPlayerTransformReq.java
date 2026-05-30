// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneCancelPlayerTransformReq(
    int cancelReason
) {
    public static ZoneSceneCancelPlayerTransformReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneCancelPlayerTransformReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneCancelPlayerTransformReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneCancelPlayerTransformReq(
            Pojos.readInt(fields, 1)
        );
    }
}
