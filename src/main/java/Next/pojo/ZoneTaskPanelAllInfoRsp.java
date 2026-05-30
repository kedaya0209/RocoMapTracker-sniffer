// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneTaskPanelAllInfoRsp(
    RetInfo retInfo,
    List<TaskTypeInfo> taskTypeList,
    List<PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo> subTaskTokenTriggeredTaskInfo,
    List<Integer> subTaskId,
    int lastGetTime,
    List<TaskTokenOwnedInfo> taskTokenOwnedData
) {
    public static ZoneTaskPanelAllInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTaskPanelAllInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskTypeInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.TaskTokenOwnedInfo::parseFrom).toList()
        );
    }
    public static ZoneTaskPanelAllInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTaskPanelAllInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskTypeInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.TaskTokenOwnedInfo::parseFrom).toList()
        );
    }
}
