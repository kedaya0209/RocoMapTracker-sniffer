// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBriefInfo(
    int uin,
    byte[] openid,
    byte[] name,
    int sex,
    int roleLevel,
    int worldLevel,
    PlayerCoreAdditionalBriefInfo coreAdditionalBriefInfo,
    byte[] platNickName,
    byte[] platAvatarUrl,
    int registerTime,
    int loginTime,
    int logoutTime,
    int loginTimes,
    int enterCellTime,
    int leaveCellTime,
    int enterCellTimes,
    int dailyOnlineTime,
    int totalOnlineTime,
    int lastSyncTime,
    int onlineState,
    int onlineStateUpdateTime,
    long onlineStateAddiData,
    long zonesvrBusppInstId,
    long cellsvrBusppInstId,
    long battlesvrBusppInstId,
    int matchState,
    PlayerBattleBriefInfo battleBrief,
    int permission,
    PlayerAdditionalData additionalData,
    PlayerVItemInfo vitemInfo,
    PlatInfo platInfo,
    PlayerHomeBriefInfo homeBriefInfo,
    PlayerHomeTeamInfo homeTeamInfo
) {
    public static PlayerBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerCoreAdditionalBriefInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBytes(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readInt(fields, 34),
            Pojos.readInt(fields, 35),
            Pojos.readInt(fields, 36),
            Pojos.readInt(fields, 37),
            Pojos.readInt(fields, 51),
            Pojos.readInt(fields, 52),
            Pojos.readInt(fields, 53),
            Pojos.readInt(fields, 71, 0),
            Pojos.readInt(fields, 72),
            Pojos.readLong(fields, 73),
            Pojos.readLong(fields, 74),
            Pojos.readLong(fields, 75),
            Pojos.readLong(fields, 76),
            Pojos.readInt(fields, 82),
            Pojos.readMessage(fields, 83) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 83)) : null,
            Pojos.readInt(fields, 91),
            Pojos.readMessage(fields, 92) != null ? Next.pojo.PlayerAdditionalData.parseFrom(Pojos.readMessage(fields, 92)) : null,
            Pojos.readMessage(fields, 93) != null ? Next.pojo.PlayerVItemInfo.parseFrom(Pojos.readMessage(fields, 93)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PlatInfo.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PlayerHomeBriefInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.PlayerHomeTeamInfo.parseFrom(Pojos.readMessage(fields, 21)) : null
        );
    }
    public static PlayerBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerCoreAdditionalBriefInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBytes(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readInt(fields, 34),
            Pojos.readInt(fields, 35),
            Pojos.readInt(fields, 36),
            Pojos.readInt(fields, 37),
            Pojos.readInt(fields, 51),
            Pojos.readInt(fields, 52),
            Pojos.readInt(fields, 53),
            Pojos.readInt(fields, 71, 0),
            Pojos.readInt(fields, 72),
            Pojos.readLong(fields, 73),
            Pojos.readLong(fields, 74),
            Pojos.readLong(fields, 75),
            Pojos.readLong(fields, 76),
            Pojos.readInt(fields, 82),
            Pojos.readMessage(fields, 83) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 83)) : null,
            Pojos.readInt(fields, 91),
            Pojos.readMessage(fields, 92) != null ? Next.pojo.PlayerAdditionalData.parseFrom(Pojos.readMessage(fields, 92)) : null,
            Pojos.readMessage(fields, 93) != null ? Next.pojo.PlayerVItemInfo.parseFrom(Pojos.readMessage(fields, 93)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PlatInfo.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PlayerHomeBriefInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.PlayerHomeTeamInfo.parseFrom(Pojos.readMessage(fields, 21)) : null
        );
    }
}
