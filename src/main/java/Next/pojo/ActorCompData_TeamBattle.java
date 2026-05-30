// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_TeamBattle(
    TeamBattleTeamInfo team,
    TeamBattleMatchInfo matchInfo,
    List<TeamBattleResultInfo> teamBattleResults
) {
    public static ActorCompData_TeamBattle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_TeamBattle(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.TeamBattleTeamInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.TeamBattleMatchInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TeamBattleResultInfo::parseFrom).toList()
        );
    }
    public static ActorCompData_TeamBattle parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_TeamBattle(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.TeamBattleTeamInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.TeamBattleMatchInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TeamBattleResultInfo::parseFrom).toList()
        );
    }
}
