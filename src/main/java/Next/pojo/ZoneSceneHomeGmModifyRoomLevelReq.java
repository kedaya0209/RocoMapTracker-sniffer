// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeGmModifyRoomLevelReq(
    int level
) {
    public static ZoneSceneHomeGmModifyRoomLevelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeGmModifyRoomLevelReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneHomeGmModifyRoomLevelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeGmModifyRoomLevelReq(
            Pojos.readInt(fields, 1)
        );
    }
}
