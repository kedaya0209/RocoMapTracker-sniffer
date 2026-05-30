// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerLimitedFlowerSeedInfo_HandbookTaskInfo(
    int petRaiseTaskId,
    PlayerLimitedFlowerSeedInfo_FinalTaskInfo finalTaskInfo,
    List<PlayerLimitedFlowerSeedInfo_SubTaskInfo> subTaskInfo
) {
    public static PlayerLimitedFlowerSeedInfo_HandbookTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerLimitedFlowerSeedInfo_HandbookTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLimitedFlowerSeedInfo_FinalTaskInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerLimitedFlowerSeedInfo_SubTaskInfo::parseFrom).toList()
        );
    }
    public static PlayerLimitedFlowerSeedInfo_HandbookTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerLimitedFlowerSeedInfo_HandbookTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLimitedFlowerSeedInfo_FinalTaskInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerLimitedFlowerSeedInfo_SubTaskInfo::parseFrom).toList()
        );
    }
}
