// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneTaskRewardRsp(
    RetInfo retInfo,
    List<PlayerTaskInfo> rewardedTaskList,
    List<PlayerTaskInfo> nextTaskList
) {
    public static ZoneTaskRewardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTaskRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList()
        );
    }
    public static ZoneTaskRewardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTaskRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList()
        );
    }
}
