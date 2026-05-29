// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetUseBagItemReq_BagItemInfo(
    int id,
    int num
) {
    public static ZonePetUseBagItemReq_BagItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetUseBagItemReq_BagItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZonePetUseBagItemReq_BagItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetUseBagItemReq_BagItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
