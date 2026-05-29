// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeClaimUnlockedFurnitureRewardRsp(
    RetInfo retInfo
) {
    public static ZoneHomeClaimUnlockedFurnitureRewardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeClaimUnlockedFurnitureRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneHomeClaimUnlockedFurnitureRewardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeClaimUnlockedFurnitureRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
