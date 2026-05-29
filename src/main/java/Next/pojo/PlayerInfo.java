// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerInfo(
    PlayerBriefInfo briefInfo,
    PlayerCommonInfo commonInfo,
    PlayerBagInfo bagInfo,
    PlayerPetInfo petInfo,
    PlayerAbilityInfo abilityInfo,
    PlayerStoryFlagInfo storyFlagInfo,
    PlayerMiscInfo miscInfo,
    PlayerWorldMapInfo worldMapInfo,
    PlayerSvrDataInfo svrDataInfo,
    PlayerRedPointInfo redPointInfo,
    PlayerBlackInfo blackInfo,
    PlayerPvpHisCli pvpHisCli,
    PlayerMusicInfo musicInfo,
    PlayerStarLightInfo starLightInfo,
    PlayerEmojiBagInfo emojiBagInfo,
    PlayerLotteryRewardConfirmBagInfo lotteryConfirm,
    PlayerClientWaterMarkInfo clientWaterMarkInfo,
    PlayerStartUpPrivilegeInfo startUpPrivilegeInfo
) {
    public static PlayerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCommonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerBagInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerPetInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerAbilityInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerStoryFlagInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerMiscInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerWorldMapInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerSvrDataInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PlayerRedPointInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PlayerBlackInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerPvpHisCli.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerMusicInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerStarLightInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PlayerEmojiBagInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.PlayerLotteryRewardConfirmBagInfo.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PlayerClientWaterMarkInfo.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 20)) : null
        );
    }
    public static PlayerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCommonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerBagInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerPetInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerAbilityInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerStoryFlagInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerMiscInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerWorldMapInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerSvrDataInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PlayerRedPointInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PlayerBlackInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerPvpHisCli.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerMusicInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerStarLightInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PlayerEmojiBagInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.PlayerLotteryRewardConfirmBagInfo.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PlayerClientWaterMarkInfo.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 20)) : null
        );
    }
}
