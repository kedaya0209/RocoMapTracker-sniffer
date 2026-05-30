// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RoomPlacementPlane(
    String planeGuid,
    List<RoomFurnitureDetails> furnitureList
) {
    public static RoomPlacementPlane parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RoomPlacementPlane(
            Pojos.readString(fields, 1),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.RoomFurnitureDetails::parseFrom).toList()
        );
    }
    public static RoomPlacementPlane parseFrom(java.util.List<ProtoField> fields) {
        return new RoomPlacementPlane(
            Pojos.readString(fields, 1),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.RoomFurnitureDetails::parseFrom).toList()
        );
    }
}
