// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneJudgePayReq(
    String openid,
    int payAmount
) {
    public static ZoneJudgePayReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneJudgePayReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneJudgePayReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneJudgePayReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
