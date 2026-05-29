// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerMiscInfo(
    ThrowItemInfo curSelectedThrowItem,
    int diamondBuyStarTimes,
    int curSelectedMagicItemGid,
    int starRecoverTime,
    List<Integer> playerRpBehaviorList,
    int minuteSendAddFriendCount,
    List<Integer> battleAiWorldNum,
    int starDebrisRecoverTime,
    int starDebrisState,
    List<StorageGoodsInfo> storageGoods,
    PlayerGPContestInfo gpContestInfo,
    int pveChallengePetSelectedId,
    int friendNumCache,
    List<GuideGroup> guideInfo,
    HomeLevelRewardInfo homeLevelRewardInfo,
    boolean queryH5Succ,
    long lastMoveMergeTime,
    int lastFashionbondTab,
    long iosRatingPopupTime,
    long netbarRewardExpiration,
    String giftCode,
    int platFriendNumCache,
    boolean videoRecording,
    List<Integer> playerRpBehaviorUsingList
) {
    public static PlayerMiscInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerMiscInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ThrowItemInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.StorageGoodsInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerGPContestInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.GuideGroup::parseFrom).toList(),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.HomeLevelRewardInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readLong(fields, 21),
            Pojos.readString(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readBool(fields, 24),
            Pojos.readIntList(fields, 25)
        );
    }
    public static PlayerMiscInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerMiscInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ThrowItemInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.StorageGoodsInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerGPContestInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.GuideGroup::parseFrom).toList(),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.HomeLevelRewardInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readLong(fields, 21),
            Pojos.readString(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readBool(fields, 24),
            Pojos.readIntList(fields, 25)
        );
    }
}
