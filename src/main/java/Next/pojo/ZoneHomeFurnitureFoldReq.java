// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeFurnitureFoldReq(
    int roomId,
    boolean foldAll,
    RoomFurnitureDetails furnitureInfo
) {
    public static ZoneHomeFurnitureFoldReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeFurnitureFoldReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RoomFurnitureDetails.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneHomeFurnitureFoldReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeFurnitureFoldReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RoomFurnitureDetails.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
