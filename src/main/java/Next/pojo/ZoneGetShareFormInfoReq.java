// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetShareFormInfoReq(
    int petId
) {
    public static ZoneGetShareFormInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetShareFormInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetShareFormInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetShareFormInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
