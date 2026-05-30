// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskContentStateList(
    int scenecfgId,
    List<TaskScenesvrStateItem> items,
    int lastSyncTime
) {
    public static TaskContentStateList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskContentStateList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskScenesvrStateItem::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
    public static TaskContentStateList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskContentStateList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskScenesvrStateItem::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
}
