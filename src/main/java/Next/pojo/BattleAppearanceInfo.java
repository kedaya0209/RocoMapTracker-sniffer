// Generated from com_appearance.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleAppearanceInfo(
    int sex,
    List<SalonItemWearData> salonItemData,
    List<Integer> fashionWearId,
    int uid,
    String sign,
    int levelId,
    String name,
    int cardLabelFirstSelected,
    int cardLabelLastSelected,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem
) {
    public static BattleAppearanceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleAppearanceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
    public static BattleAppearanceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleAppearanceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
}
