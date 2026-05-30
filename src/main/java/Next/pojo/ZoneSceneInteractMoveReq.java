// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneInteractMoveReq(
    Point toPoint
) {
    public static ZoneSceneInteractMoveReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneInteractMoveReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneInteractMoveReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneInteractMoveReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
