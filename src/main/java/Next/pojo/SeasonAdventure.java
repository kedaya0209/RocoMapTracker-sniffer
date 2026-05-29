// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SeasonAdventure(
    int seasonId,
    List<PlayerSeasonAdventureChapter> chapterList,
    PlayerSeasonAdventureBadge badgeInfo,
    long openTime,
    long settleTime
) {
    public static SeasonAdventure parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SeasonAdventure(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerSeasonAdventureChapter::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static SeasonAdventure parseFrom(java.util.List<ProtoField> fields) {
        return new SeasonAdventure(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerSeasonAdventureChapter::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
