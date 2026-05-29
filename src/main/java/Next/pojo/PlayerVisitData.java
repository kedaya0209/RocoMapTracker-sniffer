// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerVisitData(
    int visitTime,
    boolean buildVisiting,
    long visitOwnerObjId,
    List<PlayerVisitData_VisitApplyInfo> recieveApplys,
    List<PlayerVisitData_VisitApplyInfo> sendApplys,
    long backupScenesvrInstId,
    PlayerSceneInfo backupSceneInfo,
    int forbiddenTrackTask,
    PlayerVisitData_BeastBattleInfo beastInfo,
    List<PlayerVisitData_RecentVisitPlayer> visitPlayers,
    int visitStatus,
    int leaveVisitingTime,
    boolean notVisitingLogin,
    int permissionSetting,
    boolean onlineVisitTeleporting
) {
    public static PlayerVisitData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerVisitData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerVisitData_VisitApplyInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerVisitData_VisitApplyInfo::parseFrom).toList(),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerSceneInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PlayerVisitData_BeastBattleInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PlayerVisitData_RecentVisitPlayer::parseFrom).toList(),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readBool(fields, 15)
        );
    }
    public static PlayerVisitData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerVisitData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerVisitData_VisitApplyInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerVisitData_VisitApplyInfo::parseFrom).toList(),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerSceneInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PlayerVisitData_BeastBattleInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.PlayerVisitData_RecentVisitPlayer::parseFrom).toList(),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readBool(fields, 15)
        );
    }
}
