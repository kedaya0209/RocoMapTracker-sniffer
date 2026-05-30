// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NpcTaskProcessData(
    long taskId,
    long actorId,
    long actorLogicId,
    int taskType,
    int taskExecType,
    int taskPriority,
    byte[] rawPbpData
) {
    public static NpcTaskProcessData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcTaskProcessData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7)
        );
    }
    public static NpcTaskProcessData parseFrom(java.util.List<ProtoField> fields) {
        return new NpcTaskProcessData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7)
        );
    }
}
