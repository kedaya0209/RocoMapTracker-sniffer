// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskProgressList(
    int type,
    List<TaskProgressItem> items
) {
    public static TaskProgressList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskProgressList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskProgressItem::parseFrom).toList()
        );
    }
    public static TaskProgressList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskProgressList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskProgressItem::parseFrom).toList()
        );
    }
}
