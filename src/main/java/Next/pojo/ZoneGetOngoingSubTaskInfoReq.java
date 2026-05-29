// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetOngoingSubTaskInfoReq(
    int subTaskId
) {
    public static ZoneGetOngoingSubTaskInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetOngoingSubTaskInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetOngoingSubTaskInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetOngoingSubTaskInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
