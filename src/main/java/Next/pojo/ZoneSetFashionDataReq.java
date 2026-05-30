// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetFashionDataReq(
    List<Integer> fashionItemWearId,
    int wardrobeIndex,
    String wardrobeName,
    boolean useWardrobe,
    boolean trigByInteract,
    int wearSuitId,
    List<Integer> salonItemWearId,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem
) {
    public static ZoneSetFashionDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetFashionDataReq(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
    public static ZoneSetFashionDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetFashionDataReq(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
}
