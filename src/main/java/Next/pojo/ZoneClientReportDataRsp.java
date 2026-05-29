// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientReportDataRsp(
    RetInfo retInfo
) {
    public static ZoneClientReportDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientReportDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneClientReportDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientReportDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
