// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneReportPlayerReq(
    int uin,
    List<Integer> typeList,
    byte[] reportText
) {
    public static ZoneReportPlayerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReportPlayerReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static ZoneReportPlayerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReportPlayerReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
