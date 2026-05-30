// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeClaimLevelRewardReq(
    int level
) {
    public static ZoneHomeClaimLevelRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeClaimLevelRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneHomeClaimLevelRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeClaimLevelRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
