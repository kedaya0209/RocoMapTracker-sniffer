// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetExchangeInfoRsp_Exchange(
    int exchangeGroup,
    int exchangeTimes,
    int nextRefreshTime
) {
    public static ZoneGetExchangeInfoRsp_Exchange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetExchangeInfoRsp_Exchange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneGetExchangeInfoRsp_Exchange parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetExchangeInfoRsp_Exchange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
