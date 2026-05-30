// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerCommonInfo(
    int coupon,
    long coin,
    int coinLocked,
    int elo,
    int inGameTime,
    int todUpdatedTime,
    PlayerSceneInfo sceneInfo,
    PlayerLevelAwardInfo levelAwardInfo,
    PlayerClimbChapterInfo climbChapter,
    boolean startServerAi,
    List<Integer> inDungeonId,
    int onlineVisitOwner,
    byte[] banPlayerReason,
    int chatPermissionDate,
    byte[] banChatReason,
    int selectPetConfId,
    int regionId,
    List<Integer> selectPetConfIdList,
    int nextRegionGroupId,
    List<Integer> petSelectRegionId,
    int visitPermissionSetting,
    int navigationModeType,
    int homeLastVisitTime,
    boolean isHomeVisiting,
    int homeOwnerUin,
    boolean isOnlineVisitingHome,
    int homeSourceSceneCfgId,
    long homeSourceSceneInstId,
    Point homeSourceLocation,
    PlayerBanInfo banInfo
) {
    public static PlayerCommonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCommonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerSceneInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerLevelAwardInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerClimbChapterInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readIntList(fields, 17),
            Pojos.readInt(fields, 22),
            Pojos.readBytes(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readBytes(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 28),
            Pojos.readIntList(fields, 29),
            Pojos.readInt(fields, 30),
            Pojos.readIntList(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readInt(fields, 37),
            Pojos.readBool(fields, 38),
            Pojos.readInt(fields, 39),
            Pojos.readBool(fields, 40),
            Pojos.readInt(fields, 41),
            Pojos.readLong(fields, 42),
            Pojos.readMessage(fields, 43) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 43)) : null,
            Pojos.readMessage(fields, 44) != null ? Next.pojo.PlayerBanInfo.parseFrom(Pojos.readMessage(fields, 44)) : null
        );
    }
    public static PlayerCommonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCommonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerSceneInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerLevelAwardInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerClimbChapterInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readIntList(fields, 17),
            Pojos.readInt(fields, 22),
            Pojos.readBytes(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readBytes(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 28),
            Pojos.readIntList(fields, 29),
            Pojos.readInt(fields, 30),
            Pojos.readIntList(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readInt(fields, 37),
            Pojos.readBool(fields, 38),
            Pojos.readInt(fields, 39),
            Pojos.readBool(fields, 40),
            Pojos.readInt(fields, 41),
            Pojos.readLong(fields, 42),
            Pojos.readMessage(fields, 43) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 43)) : null,
            Pojos.readMessage(fields, 44) != null ? Next.pojo.PlayerBanInfo.parseFrom(Pojos.readMessage(fields, 44)) : null
        );
    }
}
