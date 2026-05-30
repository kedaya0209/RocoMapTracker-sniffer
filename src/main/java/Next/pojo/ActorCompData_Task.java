// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Task(
    List<Integer> resurrectionId,
    List<Integer> enableGuideTaskId,
    List<Integer> acceptedGuideTaskId,
    int trackTask,
    List<FailTaskAction> failActions,
    List<TaskState> tasks
) {
    public static ActorCompData_Task parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Task(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.FailTaskAction::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.TaskState::parseFrom).toList()
        );
    }
    public static ActorCompData_Task parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Task(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.FailTaskAction::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.TaskState::parseFrom).toList()
        );
    }
}
