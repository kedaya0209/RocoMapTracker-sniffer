// Generated from com_match.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MatchInfo(
    int pvpId,
    int p,
    double r,
    int rd,
    int pvpRankStar,
    int loseStreak,
    int pvpRankMasterScore,
    int pvpProfScore,
    int uin,
    long zoneInstId,
    int startUt,
    List<PetData> welfareTeam,
    int pveBattleConfId,
    List<Integer> matchedUins,
    int winStreak,
    int pvpRankOrder,
    int pvpRankSeasonMaxStar,
    int welfareTeamRoleMagicId,
    int state,
    int maxSec,
    int pveSuccUt,
    int pvpTeamScore
) {
    public static MatchInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MatchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readDouble(fields, 103),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20, 0),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23)
        );
    }
    public static MatchInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MatchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readDouble(fields, 103),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20, 0),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23)
        );
    }
}
