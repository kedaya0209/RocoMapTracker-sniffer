// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerTaskInfo(
    int id,
    int state,
    int openTime,
    int doneTime,
    List<Integer> taskTargetList,
    int doneCount,
    boolean isTrace,
    boolean stateChange,
    boolean isTrack,
    int petGid,
    boolean newTask,
    boolean hide
) {
    public static PlayerTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
    public static PlayerTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
}
