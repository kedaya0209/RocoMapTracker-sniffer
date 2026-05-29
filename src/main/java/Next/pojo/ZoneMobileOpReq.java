// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMobileOpReq(
    int opType,
    String mobileNum,
    String veriCode,
    boolean unbindAllScenes
) {
    public static ZoneMobileOpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMobileOpReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readBool(fields, 5)
        );
    }
    public static ZoneMobileOpReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMobileOpReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readBool(fields, 5)
        );
    }
}
