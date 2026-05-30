// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmTaskModifyProgressReq(
    int uin,
    int taskId,
    List<Integer> extraTaskIds,
    int taskProgress
) {
    public static ZoneGmTaskModifyProgressReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmTaskModifyProgressReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneGmTaskModifyProgressReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmTaskModifyProgressReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 3)
        );
    }
}
