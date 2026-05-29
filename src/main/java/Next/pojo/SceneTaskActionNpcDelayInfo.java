// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneTaskActionNpcDelayInfo(
    long npcContentId,
    int isFinish,
    long npcObjId,
    long taskId,
    long taskState,
    int actionType,
    int optionId
) {
    public static SceneTaskActionNpcDelayInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneTaskActionNpcDelayInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7, 0),
            Pojos.readInt(fields, 8)
        );
    }
    public static SceneTaskActionNpcDelayInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SceneTaskActionNpcDelayInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7, 0),
            Pojos.readInt(fields, 8)
        );
    }
}
