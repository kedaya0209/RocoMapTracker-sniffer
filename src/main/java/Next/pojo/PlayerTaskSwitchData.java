// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerTaskSwitchData(
    List<PlayerTaskSwitchGroupInfo> taskSwitchInfo,
    TaskSwitchConditionList conditions
) {
    public static PlayerTaskSwitchData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTaskSwitchData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerTaskSwitchGroupInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.TaskSwitchConditionList.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static PlayerTaskSwitchData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTaskSwitchData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerTaskSwitchGroupInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.TaskSwitchConditionList.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
