// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmClientTaskClearReq(
    int taskId
) {
    public static ZoneGmClientTaskClearReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmClientTaskClearReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmClientTaskClearReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmClientTaskClearReq(
            Pojos.readInt(fields, 1)
        );
    }
}
