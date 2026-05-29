// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetPlayerActivityHistoryDataReq(
    int activityType
) {
    public static ZoneGetPlayerActivityHistoryDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPlayerActivityHistoryDataReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
    public static ZoneGetPlayerActivityHistoryDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPlayerActivityHistoryDataReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
}
