// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeStartExpandRoomReq(
    int roomLevel
) {
    public static ZoneSceneHomeStartExpandRoomReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeStartExpandRoomReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneHomeStartExpandRoomReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeStartExpandRoomReq(
            Pojos.readInt(fields, 1)
        );
    }
}
