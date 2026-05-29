// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientReportLightFeatureReq(
    String reportData
) {
    public static ZoneClientReportLightFeatureReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientReportLightFeatureReq(
            Pojos.readString(fields, 1)
        );
    }
    public static ZoneClientReportLightFeatureReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientReportLightFeatureReq(
            Pojos.readString(fields, 1)
        );
    }
}
