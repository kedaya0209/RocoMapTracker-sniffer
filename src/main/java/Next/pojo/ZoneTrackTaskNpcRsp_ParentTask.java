// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTrackTaskNpcRsp_ParentTask(
    int taskId,
    int parentTaskId
) {
    public static ZoneTrackTaskNpcRsp_ParentTask parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTrackTaskNpcRsp_ParentTask(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneTrackTaskNpcRsp_ParentTask parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTrackTaskNpcRsp_ParentTask(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
