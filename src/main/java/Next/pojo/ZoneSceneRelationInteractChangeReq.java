// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRelationInteractChangeReq(
    int targetUin,
    int interactType,
    int interactSubType
) {
    public static ZoneSceneRelationInteractChangeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRelationInteractChangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static ZoneSceneRelationInteractChangeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRelationInteractChangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
