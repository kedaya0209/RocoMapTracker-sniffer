// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedFlowerPickupReq(
    int uin,
    long feedId
) {
    public static ZoneFeedFlowerPickupReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedFlowerPickupReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneFeedFlowerPickupReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedFlowerPickupReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
