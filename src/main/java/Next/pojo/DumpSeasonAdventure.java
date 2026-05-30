// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DumpSeasonAdventure(
    int seasonId,
    PlayerSeasonAdventureBadge badgeInfo,
    long openTime,
    long settleTime,
    int normalProgress,
    int challengeProgress,
    int finishChapterCnt
) {
    public static DumpSeasonAdventure parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DumpSeasonAdventure(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static DumpSeasonAdventure parseFrom(java.util.List<ProtoField> fields) {
        return new DumpSeasonAdventure(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
