// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskStoryFlagInfo(
    List<TaskStoryFlagItem> items
) {
    public static TaskStoryFlagInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskStoryFlagInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskStoryFlagItem::parseFrom).toList()
        );
    }
    public static TaskStoryFlagInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TaskStoryFlagInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskStoryFlagItem::parseFrom).toList()
        );
    }
}
