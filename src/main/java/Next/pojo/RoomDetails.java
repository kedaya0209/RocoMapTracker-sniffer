// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RoomDetails(
    int roomId,
    byte[] roomName,
    List<RoomPlacementPlane> roomPlaneList,
    List<RoomDecorationDetails> decorationList
) {
    public static RoomDetails parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RoomDetails(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.RoomPlacementPlane::parseFrom).toList(),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.RoomDecorationDetails::parseFrom).toList()
        );
    }
    public static RoomDetails parseFrom(java.util.List<ProtoField> fields) {
        return new RoomDetails(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.RoomPlacementPlane::parseFrom).toList(),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.RoomDecorationDetails::parseFrom).toList()
        );
    }
}
