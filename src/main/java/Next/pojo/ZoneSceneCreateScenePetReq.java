// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneCreateScenePetReq(
    int gid,
    Point createPt,
    long throwId,
    int createReason
) {
    public static ZoneSceneCreateScenePetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneCreateScenePetReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static ZoneSceneCreateScenePetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneCreateScenePetReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
