// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePvpInfoQueryRsp(
    RetInfo retInfo,
    int seasonId,
    int step,
    int stepFinishUt,
    int pvpRankStar,
    int pvpRankOrder,
    List<RewardInfo> starReward,
    List<RewardInfo> weekReward,
    int weekRefreshUt,
    int weekWinCount,
    int weekWinCountRequired,
    TrialPet trialPet,
    boolean pvpWeekBenefit,
    TopMasterInfo topMaster,
    int prevSeasonStar,
    int dailyFirstWinTime
) {
    public static ZonePvpInfoQueryRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePvpInfoQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.RewardInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.RewardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.TrialPet.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readBool(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.TopMasterInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17)
        );
    }
    public static ZonePvpInfoQueryRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePvpInfoQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.RewardInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.RewardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.TrialPet.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readBool(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.TopMasterInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17)
        );
    }
}
