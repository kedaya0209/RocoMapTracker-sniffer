// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerLimitedFlowerSeedInfo_SubTaskInfo(
    int taskId,
    int taskTarget,
    int taskState
) {
    public static PlayerLimitedFlowerSeedInfo_SubTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerLimitedFlowerSeedInfo_SubTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static PlayerLimitedFlowerSeedInfo_SubTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerLimitedFlowerSeedInfo_SubTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
