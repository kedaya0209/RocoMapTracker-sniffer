// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRelationInteractInviteReq(
    int targetUin,
    int interactType,
    int interactSubType,
    InteractParam param
) {
    public static ZoneSceneRelationInteractInviteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRelationInteractInviteReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneSceneRelationInteractInviteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRelationInteractInviteReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
