// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Appearance(
    List<Integer> fashionItemWearData,
    List<SalonItemWearData> salonItemWearData,
    List<Integer> fashionBondData,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem
) {
    public static ActorCompData_Appearance parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Appearance(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
    public static ActorCompData_Appearance parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Appearance(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
}
