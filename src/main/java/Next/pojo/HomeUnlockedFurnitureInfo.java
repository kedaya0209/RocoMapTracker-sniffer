// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeUnlockedFurnitureInfo(
    List<UnlockedFurniture> unlockedFurnitureList,
    List<FurnitureHandBook> handbookList
) {
    public static HomeUnlockedFurnitureInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeUnlockedFurnitureInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FurnitureHandBook::parseFrom).toList()
        );
    }
    public static HomeUnlockedFurnitureInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeUnlockedFurnitureInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FurnitureHandBook::parseFrom).toList()
        );
    }
}
