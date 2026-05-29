// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneTaskInfoNotify(
    List<PlayerTaskInfo> taskInfoList,
    List<Integer> deleteTaskList,
    RetInfo retInfo,
    int openTaskNum,
    int guidingTaskNum,
    int isAllActivityTask
) {
    public static ZoneTaskInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTaskInfoNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneTaskInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTaskInfoNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
