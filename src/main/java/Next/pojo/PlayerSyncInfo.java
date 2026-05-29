// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerSyncInfo(
    int level,
    int exp,
    int battleState,
    int coupon,
    long coin,
    int coinLocked,
    int elo,
    int servertime,
    byte[] name,
    int sex,
    List<Integer> inDungeonId,
    int worldLevel,
    int onlineVisitOwner,
    int selectPetConfId,
    PlayerVItemInfo vitemInfo,
    List<Integer> selectPetConfIdList,
    List<Integer> petSelectRegionId
) {
    public static PlayerSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerVItemInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readIntList(fields, 17),
            Pojos.readIntList(fields, 18)
        );
    }
    public static PlayerSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerVItemInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readIntList(fields, 17),
            Pojos.readIntList(fields, 18)
        );
    }
}
