// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TaskState(
    int taskId,
    int state
) {
    public static TaskState parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskState(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 6)
        );
    }
    public static TaskState parseFrom(java.util.List<ProtoField> fields) {
        return new TaskState(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 6)
        );
    }
}
