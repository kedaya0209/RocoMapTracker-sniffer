// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRefreshMixActivityTaskReq(
    int activityId,
    int taskId
) {
    public static ZoneRefreshMixActivityTaskReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRefreshMixActivityTaskReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneRefreshMixActivityTaskReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRefreshMixActivityTaskReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
