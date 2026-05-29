// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetMobileVeriCodeReq(
    int opType,
    String mobileNum
) {
    public static ZoneGetMobileVeriCodeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetMobileVeriCodeReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readString(fields, 2)
        );
    }
    public static ZoneGetMobileVeriCodeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetMobileVeriCodeReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readString(fields, 2)
        );
    }
}
