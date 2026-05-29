// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerSubTaskInfo(
    int lastRefreshTime,
    List<Integer> randomSubTaskId,
    List<PlayerSubTaskInfo_OngoingSubTaskInfo> ongoingSubTaskInfo,
    int lastNotifyTime,
    int lastGetTime,
    List<PlayerSubTaskInfo_TaskTokenOwnedInfo> taskTokenOwnedInfo,
    List<PlayerSubTaskInfo_SubTaskTokenGrantInfo> subTaskTokenGrantInfo,
    int subTaskFinishedTimes,
    List<Integer> subTaskFinishedQueue,
    int subTaskBonusNum,
    List<PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo> subTaskTokenTriggeredTaskInfo
) {
    public static PlayerSubTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSubTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerSubTaskInfo_OngoingSubTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerSubTaskInfo_TaskTokenOwnedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerSubTaskInfo_SubTaskTokenGrantInfo::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo::parseFrom).toList()
        );
    }
    public static PlayerSubTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSubTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerSubTaskInfo_OngoingSubTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerSubTaskInfo_TaskTokenOwnedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerSubTaskInfo_SubTaskTokenGrantInfo::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.PlayerSubTaskInfo_SubTaskTokenTriggeredTaskInfo::parseFrom).toList()
        );
    }
}
