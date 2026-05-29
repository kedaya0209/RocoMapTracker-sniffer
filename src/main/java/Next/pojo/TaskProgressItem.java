// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TaskProgressItem(
    int taskId,
    int taskTktId,
    int val,
    long lastUpdateSeq,
    long gid
) {
    public static TaskProgressItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskProgressItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 8),
            Pojos.readLong(fields, 9)
        );
    }
    public static TaskProgressItem parseFrom(java.util.List<ProtoField> fields) {
        return new TaskProgressItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 8),
            Pojos.readLong(fields, 9)
        );
    }
}
