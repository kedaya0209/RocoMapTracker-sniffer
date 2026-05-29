// Generated from com_match.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MatchSuccInfo(
    int uin,
    long zoneInstId,
    double r,
    int rd,
    int pvpRankStar,
    List<PetData> welfareTeam,
    int pveBattleConfId,
    int winStreak,
    int pvpRankOrder,
    int loseStreak,
    int pvpRankMasterScore,
    int pvpRankSeasonMaxStar,
    int welfareTeamRoleMagicId
) {
    public static MatchSuccInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MatchSuccInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readDouble(fields, 103),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
    public static MatchSuccInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MatchSuccInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readDouble(fields, 103),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
}
