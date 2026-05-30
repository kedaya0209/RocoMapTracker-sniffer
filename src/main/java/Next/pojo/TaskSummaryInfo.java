// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TaskSummaryInfo(
    int posX,
    int posY,
    int posZ,
    int summaryId,
    int tod,
    int weather1,
    BattleFashionInfo fashion,
    int createTime,
    int taskId,
    int weather2
) {
    public static TaskSummaryInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskSummaryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static TaskSummaryInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TaskSummaryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
