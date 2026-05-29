// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskScenesvrStateList(
    int type,
    List<TaskContentItem> contentItems,
    List<TaskNpcOptionItem> npcOptionItems
) {
    public static TaskScenesvrStateList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskScenesvrStateList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskContentItem::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TaskNpcOptionItem::parseFrom).toList()
        );
    }
    public static TaskScenesvrStateList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskScenesvrStateList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskContentItem::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TaskNpcOptionItem::parseFrom).toList()
        );
    }
}
