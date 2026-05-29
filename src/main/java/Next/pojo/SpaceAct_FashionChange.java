// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_FashionChange(
    long actorId,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem,
    List<Integer> fashionItemWearData
) {
    public static SpaceAct_FashionChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_FashionChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList(),
            Pojos.readIntList(fields, 3)
        );
    }
    public static SpaceAct_FashionChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_FashionChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList(),
            Pojos.readIntList(fields, 3)
        );
    }
}
