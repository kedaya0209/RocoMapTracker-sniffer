// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetPlayerCardSignatureReq(
    byte[] signature
) {
    public static ZoneSetPlayerCardSignatureReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerCardSignatureReq(
            Pojos.readBytes(fields, 1)
        );
    }
    public static ZoneSetPlayerCardSignatureReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerCardSignatureReq(
            Pojos.readBytes(fields, 1)
        );
    }
}
