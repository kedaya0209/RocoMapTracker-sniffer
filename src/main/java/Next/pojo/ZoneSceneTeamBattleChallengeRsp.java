// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleChallengeRsp(
    RetInfo retInfo,
    List<Integer> visitors,
    int challengeType,
    List<TeamBattleMateInfo> mateInfos,
    BanInfo banInfo
) {
    public static ZoneSceneTeamBattleChallengeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleChallengeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.TeamBattleMateInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static ZoneSceneTeamBattleChallengeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleChallengeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.TeamBattleMateInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
