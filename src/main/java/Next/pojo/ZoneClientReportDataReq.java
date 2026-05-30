// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientReportDataReq(
    String reportData,
    int type,
    int sendType,
    long battleId
) {
    public static ZoneClientReportDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientReportDataReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static ZoneClientReportDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientReportDataReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
