// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeClaimUnlockedFurnitureRewardReq(
    int handbookId
) {
    public static ZoneHomeClaimUnlockedFurnitureRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeClaimUnlockedFurnitureRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneHomeClaimUnlockedFurnitureRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeClaimUnlockedFurnitureRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
