// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeFinishExpandRoomReq(
    int roomLevel
) {
    public static ZoneSceneHomeFinishExpandRoomReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeFinishExpandRoomReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneHomeFinishExpandRoomReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeFinishExpandRoomReq(
            Pojos.readInt(fields, 1)
        );
    }
}
