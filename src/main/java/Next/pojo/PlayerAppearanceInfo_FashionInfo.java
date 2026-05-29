// Generated from com_appearance.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo_FashionInfo(
    List<PlayerAppearanceInfo_FashionInfo_WardrobeData> wardrobeData,
    int currentWardrobeIndex,
    List<Integer> itemOwnedId,
    int suitId,
    List<PlayerAppearanceInfo_FashionInfo_SuitInfo> suitInfo,
    List<PlayerAppearanceInfo_FashionInfo_ItemInfo> ownedItemInfo,
    PlayerAppearanceInfo_FashionInfo_InitRole initRoleInfo
) {
    public static PlayerAppearanceInfo_FashionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo_FashionInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_ItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_InitRole.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
    public static PlayerAppearanceInfo_FashionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo_FashionInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_ItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_InitRole.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
}
