// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerSubTaskInfo_OngoingSubTaskInfo(
    int subTaskId,
    List<PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo> taskTokenInfo
) {
    public static PlayerSubTaskInfo_OngoingSubTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSubTaskInfo_OngoingSubTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo::parseFrom).toList()
        );
    }
    public static PlayerSubTaskInfo_OngoingSubTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSubTaskInfo_OngoingSubTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo::parseFrom).toList()
        );
    }
}
