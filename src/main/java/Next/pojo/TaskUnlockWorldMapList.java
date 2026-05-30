// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskUnlockWorldMapList(
    List<TaskUnlockWorldMapItem> items
) {
    public static TaskUnlockWorldMapList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskUnlockWorldMapList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskUnlockWorldMapItem::parseFrom).toList()
        );
    }
    public static TaskUnlockWorldMapList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskUnlockWorldMapList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskUnlockWorldMapItem::parseFrom).toList()
        );
    }
}
