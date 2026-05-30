// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientReportData2Req(
    String reportData,
    int type
) {
    public static ZoneClientReportData2Req parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientReportData2Req(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneClientReportData2Req parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientReportData2Req(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
