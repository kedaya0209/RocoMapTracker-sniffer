// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPvpRankSeasonRewardReq(
    List<Integer> rankStar
) {
    public static ZoneGetPvpRankSeasonRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPvpRankSeasonRewardReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneGetPvpRankSeasonRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPvpRankSeasonRewardReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
