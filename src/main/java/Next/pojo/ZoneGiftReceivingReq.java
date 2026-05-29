// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGiftReceivingReq(
    int giverUin,
    int giftUniqueId,
    int goodsType,
    int goodsId,
    int goodsNum
) {
    public static ZoneGiftReceivingReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGiftReceivingReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneGiftReceivingReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGiftReceivingReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
