// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneSetBroadcastLimitReq(
    int newLimit
) {
    public static ZoneSceneSetBroadcastLimitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSetBroadcastLimitReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneSetBroadcastLimitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSetBroadcastLimitReq(
            Pojos.readInt(fields, 1)
        );
    }
}
