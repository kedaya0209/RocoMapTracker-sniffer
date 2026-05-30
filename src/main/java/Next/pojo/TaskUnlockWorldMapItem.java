// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TaskUnlockWorldMapItem(
    int worldId,
    int lastUpdateTask,
    int lastUpdateSeq
) {
    public static TaskUnlockWorldMapItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskUnlockWorldMapItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static TaskUnlockWorldMapItem parseFrom(java.util.List<ProtoField> fields) {
        return new TaskUnlockWorldMapItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
