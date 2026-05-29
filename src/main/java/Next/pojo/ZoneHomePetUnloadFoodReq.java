// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePetUnloadFoodReq(
    int itemGid,
    int itemConfId
) {
    public static ZoneHomePetUnloadFoodReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetUnloadFoodReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneHomePetUnloadFoodReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetUnloadFoodReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
