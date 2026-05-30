// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneClaimNetbarRewardReq(
    String ip,
    List<String> macs,
    String netbarToken
) {
    public static ZoneClaimNetbarRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClaimNetbarRewardReq(
            Pojos.readString(fields, 1),
            Pojos.readStringList(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
    public static ZoneClaimNetbarRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClaimNetbarRewardReq(
            Pojos.readString(fields, 1),
            Pojos.readStringList(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
}
