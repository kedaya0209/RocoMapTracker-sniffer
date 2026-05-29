// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskTypeInfo(
    int taskType,
    boolean open,
    List<TaskTypeInfo_ParagraphInfo> openParagraph,
    List<TaskTypeInfo_ParagraphInfo> doneParagraph,
    List<Integer> willParagraph,
    int taskNum
) {
    public static TaskTypeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskTypeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TaskTypeInfo_ParagraphInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.TaskTypeInfo_ParagraphInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static TaskTypeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TaskTypeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TaskTypeInfo_ParagraphInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.TaskTypeInfo_ParagraphInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
