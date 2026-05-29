// Generated from com_appearance.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleFashionInfo(
    List<Integer> fashionId,
    List<SalonItemWearData> salonItemData,
    int cardLabelFirstSelected,
    int cardLabelLastSelected,
    PlayerAppearanceInfo_BondInfo bondInfo,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem,
    String npcTitle
) {
    public static BattleFashionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleFashionInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerAppearanceInfo_BondInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList(),
            Pojos.readString(fields, 7)
        );
    }
    public static BattleFashionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleFashionInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerAppearanceInfo_BondInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList(),
            Pojos.readString(fields, 7)
        );
    }
}
