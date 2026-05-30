// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerLimitedFlowerSeedInfo(
    int specFlowerSeedId,
    PlayerLimitedFlowerSeedInfo_PreTaskInfo preTaskInfo,
    List<PlayerLimitedFlowerSeedInfo_InvestTaskInfo> investTaskInfo,
    List<PlayerLimitedFlowerSeedInfo_HandbookTaskInfo> handbookTaskInfo,
    int flowerSeedContentId
) {
    public static PlayerLimitedFlowerSeedInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerLimitedFlowerSeedInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLimitedFlowerSeedInfo_PreTaskInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerLimitedFlowerSeedInfo_InvestTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerLimitedFlowerSeedInfo_HandbookTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
    public static PlayerLimitedFlowerSeedInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerLimitedFlowerSeedInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLimitedFlowerSeedInfo_PreTaskInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerLimitedFlowerSeedInfo_InvestTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerLimitedFlowerSeedInfo_HandbookTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
}
