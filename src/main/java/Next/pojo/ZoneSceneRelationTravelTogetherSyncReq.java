// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRelationTravelTogetherSyncReq(
    Position posDiff,
    Position reportPos
) {
    public static ZoneSceneRelationTravelTogetherSyncReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRelationTravelTogetherSyncReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneRelationTravelTogetherSyncReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRelationTravelTogetherSyncReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
