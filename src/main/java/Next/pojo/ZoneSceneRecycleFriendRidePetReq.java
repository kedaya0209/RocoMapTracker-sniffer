// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRecycleFriendRidePetReq(
    int friendUin
) {
    public static ZoneSceneRecycleFriendRidePetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRecycleFriendRidePetReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneRecycleFriendRidePetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRecycleFriendRidePetReq(
            Pojos.readInt(fields, 1)
        );
    }
}
