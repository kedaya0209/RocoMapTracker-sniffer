// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneDiamondBuyStarTimesNotify(
    int buyTimes
) {
    public static ZoneDiamondBuyStarTimesNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneDiamondBuyStarTimesNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneDiamondBuyStarTimesNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneDiamondBuyStarTimesNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
