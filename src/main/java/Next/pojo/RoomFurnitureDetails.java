// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RoomFurnitureDetails(
    long furnitureGuid,
    long parentFurnitureGuid,
    int itemGid,
    int configId,
    Point position,
    long npcId
) {
    public static RoomFurnitureDetails parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RoomFurnitureDetails(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7)
        );
    }
    public static RoomFurnitureDetails parseFrom(java.util.List<ProtoField> fields) {
        return new RoomFurnitureDetails(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7)
        );
    }
}
