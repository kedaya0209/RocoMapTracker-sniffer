// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerInvestTaskData(
    int investTaskRandTime,
    List<Integer> topicTaskList,
    int specialRewardItem,
    List<Integer> clueTaskList
) {
    public static PlayerInvestTaskData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerInvestTaskData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
    public static PlayerInvestTaskData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerInvestTaskData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
}
