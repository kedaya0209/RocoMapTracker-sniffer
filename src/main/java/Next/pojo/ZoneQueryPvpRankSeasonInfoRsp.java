// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryPvpRankSeasonInfoRsp(
    RetInfo retInfo,
    RankSeasonInfo rankSeasonInfo
) {
    public static ZoneQueryPvpRankSeasonInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryPvpRankSeasonInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RankSeasonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneQueryPvpRankSeasonInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryPvpRankSeasonInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RankSeasonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
