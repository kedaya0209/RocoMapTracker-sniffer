// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskSwitchConditionList(
    List<TaskSwitchConditionInfo> conditionData
) {
    public static TaskSwitchConditionList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskSwitchConditionList(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TaskSwitchConditionInfo::parseFrom).toList()
        );
    }
    public static TaskSwitchConditionList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskSwitchConditionList(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TaskSwitchConditionInfo::parseFrom).toList()
        );
    }
}
