// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RankSeasonInfo(
    int seasonId,
    int battleCnt,
    int winCount,
    int maxWinStreak,
    List<RankSeasonPetUseInfo> petUseInfo,
    List<MagicUsedInfo> magicUsed,
    int rankStar
) {
    public static RankSeasonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RankSeasonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.RankSeasonPetUseInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.MagicUsedInfo::parseFrom).toList(),
            Pojos.readInt(fields, 7)
        );
    }
    public static RankSeasonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RankSeasonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.RankSeasonPetUseInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.MagicUsedInfo::parseFrom).toList(),
            Pojos.readInt(fields, 7)
        );
    }
}
