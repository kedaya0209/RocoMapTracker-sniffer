// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeRenameRoomReq(
    int roomId,
    byte[] roomName
) {
    public static ZoneSceneHomeRenameRoomReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeRenameRoomReq(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static ZoneSceneHomeRenameRoomReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeRenameRoomReq(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
