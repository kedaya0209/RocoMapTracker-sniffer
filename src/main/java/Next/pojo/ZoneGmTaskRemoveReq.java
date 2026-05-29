// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmTaskRemoveReq(
    int uin,
    int taskId,
    List<Integer> extraTaskIds
) {
    public static ZoneGmTaskRemoveReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmTaskRemoveReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneGmTaskRemoveReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmTaskRemoveReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
