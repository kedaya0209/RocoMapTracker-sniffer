// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTaskReadedReq(
    int taskId
) {
    public static ZoneTaskReadedReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTaskReadedReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneTaskReadedReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTaskReadedReq(
            Pojos.readInt(fields, 1)
        );
    }
}
