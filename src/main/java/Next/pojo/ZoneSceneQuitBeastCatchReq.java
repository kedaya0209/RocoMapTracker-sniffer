// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneQuitBeastCatchReq(
    long npcObjId,
    long npcLogicId
) {
    public static ZoneSceneQuitBeastCatchReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneQuitBeastCatchReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneSceneQuitBeastCatchReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneQuitBeastCatchReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
