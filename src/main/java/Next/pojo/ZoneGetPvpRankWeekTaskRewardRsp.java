// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPvpRankWeekTaskRewardRsp(
    RetInfo retInfo,
    List<RewardInfo> reward
) {
    public static ZoneGetPvpRankWeekTaskRewardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPvpRankWeekTaskRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RewardInfo::parseFrom).toList()
        );
    }
    public static ZoneGetPvpRankWeekTaskRewardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPvpRankWeekTaskRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RewardInfo::parseFrom).toList()
        );
    }
}
