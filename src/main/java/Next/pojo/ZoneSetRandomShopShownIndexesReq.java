// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetRandomShopShownIndexesReq(
    int shopId,
    List<Integer> indexes
) {
    public static ZoneSetRandomShopShownIndexesReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetRandomShopShownIndexesReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneSetRandomShopShownIndexesReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetRandomShopShownIndexesReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
