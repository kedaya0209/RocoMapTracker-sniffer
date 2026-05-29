// Generated from com_appearance.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo_FashionInfo_WardrobeData(
    List<Integer> itemWearId,
    String name,
    List<Integer> salonItemWearId,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem
) {
    public static PlayerAppearanceInfo_FashionInfo_WardrobeData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo_FashionInfo_WardrobeData(
            Pojos.readIntList(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
    public static PlayerAppearanceInfo_FashionInfo_WardrobeData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo_FashionInfo_WardrobeData(
            Pojos.readIntList(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
}
