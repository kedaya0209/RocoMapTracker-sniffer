// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetLimitedFlowerSeedInfoRsp(
    RetInfo retInfo,
    PlayerLimitedFlowerSeedInfo limitedFlowerSeedInfo
) {
    public static ZoneGetLimitedFlowerSeedInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetLimitedFlowerSeedInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLimitedFlowerSeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGetLimitedFlowerSeedInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetLimitedFlowerSeedInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLimitedFlowerSeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
