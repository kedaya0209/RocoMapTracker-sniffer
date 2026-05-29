// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TeamBattleTeamInfo(
    List<TeamBattleMateInfo> mateInfos,
    int createTeamTime,
    TeamBattleInfo battleInfo,
    List<MateSettleInfo> settleInfos,
    boolean battling
) {
    public static TeamBattleTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TeamBattleTeamInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TeamBattleMateInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.TeamBattleInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.MateSettleInfo::parseFrom).toList(),
            Pojos.readBool(fields, 5)
        );
    }
    public static TeamBattleTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TeamBattleTeamInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TeamBattleMateInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.TeamBattleInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.MateSettleInfo::parseFrom).toList(),
            Pojos.readBool(fields, 5)
        );
    }
}
