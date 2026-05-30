// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneQueryInvestTaskRsp(
    RetInfo retInfo,
    List<PlayerTaskInfo> investTaskList,
    List<PlayerTaskInfo> clueTaskList,
    List<PlayerTaskInfo> topicTaskList,
    int remainTime,
    int specialRewardItem
) {
    public static ZoneQueryInvestTaskRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryInvestTaskRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneQueryInvestTaskRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryInvestTaskRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
