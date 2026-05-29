// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleMateSyncNotify(
    List<TeamBattleMateInfo> mateInfos,
    int syncReason,
    int updateUin,
    int challengeType
) {
    public static ZoneSceneTeamBattleMateSyncNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleMateSyncNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TeamBattleMateInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneSceneTeamBattleMateSyncNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleMateSyncNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TeamBattleMateInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
