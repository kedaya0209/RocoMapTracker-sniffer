// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetPetReportInfosByPageReq(
    int pageNum
) {
    public static ZoneGetPetReportInfosByPageReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPetReportInfosByPageReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetPetReportInfosByPageReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPetReportInfosByPageReq(
            Pojos.readInt(fields, 1)
        );
    }
}
