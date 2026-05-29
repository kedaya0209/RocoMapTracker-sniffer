// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReportDataSend2Client(
    String reportData,
    int type
) {
    public static ZoneReportDataSend2Client parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReportDataSend2Client(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneReportDataSend2Client parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReportDataSend2Client(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
