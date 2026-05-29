// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityWeeklyChallengeTeam(
    List<Integer> petConfId,
    int totalCheerPoint,
    List<Integer> petGid,
    int teamId,
    PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto photo,
    List<Integer> fashionIds,
    List<SalonItemWearData> salonItemData,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem
) {
    public static PlayerActivityInfo_ActivityWeeklyChallengeTeam parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityWeeklyChallengeTeam(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readIntList(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityWeeklyChallengeTeam parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityWeeklyChallengeTeam(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readIntList(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
}
