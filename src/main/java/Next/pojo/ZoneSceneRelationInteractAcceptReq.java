// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRelationInteractAcceptReq(
    int targetUin,
    int interactType,
    int interactSubType,
    InteractParam param
) {
    public static ZoneSceneRelationInteractAcceptReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRelationInteractAcceptReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneSceneRelationInteractAcceptReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRelationInteractAcceptReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
