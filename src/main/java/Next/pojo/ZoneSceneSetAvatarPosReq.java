// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneSetAvatarPosReq(
    Point pos,
    int reason
) {
    public static ZoneSceneSetAvatarPosReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSetAvatarPosReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneSetAvatarPosReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSetAvatarPosReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
