// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRelationRecoverModifyBuffReq(
    int buffVal
) {
    public static ZoneSceneRelationRecoverModifyBuffReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRelationRecoverModifyBuffReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneRelationRecoverModifyBuffReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRelationRecoverModifyBuffReq(
            Pojos.readInt(fields, 1)
        );
    }
}
