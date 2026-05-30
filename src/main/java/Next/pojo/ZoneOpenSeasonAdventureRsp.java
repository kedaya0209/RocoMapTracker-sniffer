// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneOpenSeasonAdventureRsp(
    RetInfo retInfo,
    int seasonId,
    int chapterId,
    boolean rewarded,
    List<PlayerTaskInfo> chapterTaskList,
    SeasonAdventureBadge badgeInfo,
    List<PlayerSeasonAdventureChapter> chapterBaseInfos
) {
    public static ZoneOpenSeasonAdventureRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneOpenSeasonAdventureRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerSeasonAdventureChapter::parseFrom).toList()
        );
    }
    public static ZoneOpenSeasonAdventureRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneOpenSeasonAdventureRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerSeasonAdventureChapter::parseFrom).toList()
        );
    }
}
