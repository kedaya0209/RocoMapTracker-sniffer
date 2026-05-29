// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerAdditionalData(
    int worldLevel,
    PlayerCardBriefInfo cardBriefInfo,
    int totalRecharge,
    int totalPetCount,
    int areaMailFlag,
    int totalHandbookCount,
    PlayerMobileBindData mobileBindInfo,
    PlayerSettingBriefInfo settingBriefInfo,
    PlayerDeletionInfo deletionInfo,
    long onlineStateUpdateTimes,
    PlayerBattlePassBriefInfo battlePassBriefInfo,
    byte[] regGameChannel,
    PlayerStartUpPrivilegeInfo startUpPrivilegeInfo
) {
    public static PlayerAdditionalData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAdditionalData(
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PlayerSettingBriefInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerDeletionInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readLong(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerBattlePassBriefInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readBytes(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 19)) : null
        );
    }
    public static PlayerAdditionalData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAdditionalData(
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PlayerSettingBriefInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerDeletionInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readLong(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerBattlePassBriefInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readBytes(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 19)) : null
        );
    }
}
