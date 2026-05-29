// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBusinessCardUploadSuccessReq(
    String photoName
) {
    public static ZoneBusinessCardUploadSuccessReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBusinessCardUploadSuccessReq(
            Pojos.readString(fields, 1)
        );
    }
    public static ZoneBusinessCardUploadSuccessReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBusinessCardUploadSuccessReq(
            Pojos.readString(fields, 1)
        );
    }
}
