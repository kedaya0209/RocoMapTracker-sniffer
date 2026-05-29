// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneCreateSceneSeatReq(
    Point createPt,
    int npcConfigId,
    List<Point> createPts
) {
    public static ZoneSceneCreateSceneSeatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneCreateSceneSeatReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Point::parseFrom).toList()
        );
    }
    public static ZoneSceneCreateSceneSeatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneCreateSceneSeatReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Point::parseFrom).toList()
        );
    }
}
