// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskContentOptionList(
    List<TaskContentOptionItem> items
) {
    public static TaskContentOptionList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskContentOptionList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskContentOptionItem::parseFrom).toList()
        );
    }
    public static TaskContentOptionList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskContentOptionList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskContentOptionItem::parseFrom).toList()
        );
    }
}
