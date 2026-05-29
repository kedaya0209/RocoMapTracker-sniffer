// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskSummaryList(
    List<TaskSummaryInfo> summaryData
) {
    public static TaskSummaryList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskSummaryList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskSummaryInfo::parseFrom).toList()
        );
    }
    public static TaskSummaryList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskSummaryList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskSummaryInfo::parseFrom).toList()
        );
    }
}
