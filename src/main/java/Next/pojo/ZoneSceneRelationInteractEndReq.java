// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRelationInteractEndReq(
    int targetUin,
    int interactType,
    int interactSubType
) {
    public static ZoneSceneRelationInteractEndReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRelationInteractEndReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static ZoneSceneRelationInteractEndReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRelationInteractEndReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
