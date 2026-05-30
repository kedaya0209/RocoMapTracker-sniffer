// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRecycleSceneSeatReq(
    long recycleNpcId
) {
    public static ZoneSceneRecycleSceneSeatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRecycleSceneSeatReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneSceneRecycleSceneSeatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRecycleSceneSeatReq(
            Pojos.readLong(fields, 1)
        );
    }
}
