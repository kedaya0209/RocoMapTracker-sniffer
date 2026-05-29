// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerHomeBriefInfo(
    byte[] homeName,
    int homeExperience,
    int homeLevel,
    int roomLevel,
    int homeComfortLevel,
    RoomExpansionInfo roomExpansionInfo,
    List<UnlockedFurniture> unlockedFurnitureList
) {
    public static PlayerHomeBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerHomeBriefInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessageList(fields, 40).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList()
        );
    }
    public static PlayerHomeBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerHomeBriefInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessageList(fields, 40).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList()
        );
    }
}
