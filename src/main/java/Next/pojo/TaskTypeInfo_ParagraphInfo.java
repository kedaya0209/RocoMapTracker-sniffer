// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TaskTypeInfo_ParagraphInfo(
    int paragraph,
    int time,
    boolean isHide
) {
    public static TaskTypeInfo_ParagraphInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskTypeInfo_ParagraphInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static TaskTypeInfo_ParagraphInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TaskTypeInfo_ParagraphInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
