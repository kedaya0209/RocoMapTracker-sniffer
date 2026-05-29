// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomeInfo(
    byte[] homeName,
    int homeOwnerId,
    int homeExperience,
    int homeLevel,
    int roomLevel,
    int homeComfortLevel,
    HomeAccessInfo accessInfo,
    RoomLayoutInfo roomLayout,
    RoomExpansionInfo roomExpansionInfo,
    HomeLayEggCoupleInfo layEggCouple
) {
    public static HomeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.HomeAccessInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.HomeLayEggCoupleInfo.parseFrom(Pojos.readMessage(fields, 22)) : null
        );
    }
    public static HomeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.HomeAccessInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.HomeLayEggCoupleInfo.parseFrom(Pojos.readMessage(fields, 22)) : null
        );
    }
}
