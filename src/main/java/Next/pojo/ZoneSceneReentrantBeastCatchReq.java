// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneReentrantBeastCatchReq(
    long npcLogicId,
    long npcObjId
) {
    public static ZoneSceneReentrantBeastCatchReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneReentrantBeastCatchReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneSceneReentrantBeastCatchReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneReentrantBeastCatchReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
