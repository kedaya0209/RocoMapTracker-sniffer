// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryPvpRankSeasonInfoReq(
    int seasonId
) {
    public static ZoneQueryPvpRankSeasonInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryPvpRankSeasonInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneQueryPvpRankSeasonInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryPvpRankSeasonInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
