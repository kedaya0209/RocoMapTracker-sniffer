// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerHomeFurnitureInfo(
    List<UnlockedFurniture> unlockedFurnitureList,
    HomeUnlockedFurnitureInfo hufiChange
) {
    public static PlayerHomeFurnitureInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerHomeFurnitureInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeUnlockedFurnitureInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static PlayerHomeFurnitureInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerHomeFurnitureInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeUnlockedFurnitureInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
