// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUpgradePlayerCardSkinReq(
    int skinId
) {
    public static ZoneUpgradePlayerCardSkinReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpgradePlayerCardSkinReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneUpgradePlayerCardSkinReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpgradePlayerCardSkinReq(
            Pojos.readInt(fields, 1)
        );
    }
}
