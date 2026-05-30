// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo(
    int triggeredTaskId,
    int triggeredSubTaskTokenId
) {
    public static PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
