// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskTrackRecoverInfo(
    int taskId,
    List<TaskContentItem> contentItems
) {
    public static TaskTrackRecoverInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskTrackRecoverInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskContentItem::parseFrom).toList()
        );
    }
    public static TaskTrackRecoverInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TaskTrackRecoverInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskContentItem::parseFrom).toList()
        );
    }
}
