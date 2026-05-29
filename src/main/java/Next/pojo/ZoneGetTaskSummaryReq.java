// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetTaskSummaryReq(
    int taskId
) {
    public static ZoneGetTaskSummaryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetTaskSummaryReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetTaskSummaryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetTaskSummaryReq(
            Pojos.readInt(fields, 1)
        );
    }
}
