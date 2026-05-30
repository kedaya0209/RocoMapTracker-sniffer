// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetCreditScoreReq(
    String openid,
    int accountType,
    boolean needResponse
) {
    public static ZoneGetCreditScoreReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetCreditScoreReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneGetCreditScoreReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetCreditScoreReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
