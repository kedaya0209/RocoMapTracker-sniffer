// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeSaveRoomLayoutReq(
    RoomLayoutInfo roomLayoutInfo,
    boolean forceSave
) {
    public static ZoneSceneHomeSaveRoomLayoutReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeSaveRoomLayoutReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneHomeSaveRoomLayoutReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeSaveRoomLayoutReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
}
