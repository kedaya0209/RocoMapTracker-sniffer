// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskProgressData(
    List<TaskProgressList> progressData,
    long gid,
    long ack,
    long lastScenesvrId,
    long lastAckTime
) {
    public static TaskProgressData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskProgressData(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskProgressList::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14)
        );
    }
    public static TaskProgressData parseFrom(java.util.List<ProtoField> fields) {
        return new TaskProgressData(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskProgressList::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14)
        );
    }
}
