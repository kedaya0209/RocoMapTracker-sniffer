// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneOpenSubTaskReq(
    int subTaskId
) {
    public static ZoneOpenSubTaskReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneOpenSubTaskReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneOpenSubTaskReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneOpenSubTaskReq(
            Pojos.readInt(fields, 1)
        );
    }
}
