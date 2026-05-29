// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetNavigationModeTypeReq(
    int modeType
) {
    public static ZoneSetNavigationModeTypeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetNavigationModeTypeReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSetNavigationModeTypeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetNavigationModeTypeReq(
            Pojos.readInt(fields, 1)
        );
    }
}
