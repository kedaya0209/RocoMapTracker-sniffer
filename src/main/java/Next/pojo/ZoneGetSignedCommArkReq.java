// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetSignedCommArkReq(
    int businessType
) {
    public static ZoneGetSignedCommArkReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetSignedCommArkReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetSignedCommArkReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetSignedCommArkReq(
            Pojos.readInt(fields, 1)
        );
    }
}
