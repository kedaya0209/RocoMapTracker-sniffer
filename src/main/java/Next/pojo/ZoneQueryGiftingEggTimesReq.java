// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryGiftingEggTimesReq(
    int targetUin
) {
    public static ZoneQueryGiftingEggTimesReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryGiftingEggTimesReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneQueryGiftingEggTimesReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryGiftingEggTimesReq(
            Pojos.readInt(fields, 1)
        );
    }
}
