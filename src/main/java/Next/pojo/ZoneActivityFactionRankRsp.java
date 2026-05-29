// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneActivityFactionRankRsp(
    RetInfo retInfo,
    FactionRankInfo rankInfo
) {
    public static ZoneActivityFactionRankRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivityFactionRankRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FactionRankInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneActivityFactionRankRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivityFactionRankRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FactionRankInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
