// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerQQAchievementInfo(
    long curDay,
    int dayAccGameDuration,
    long lastStatTime,
    byte[] achievementRegChannel,
    PlayerQQAchievementStats stats
) {
    public static PlayerQQAchievementInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerQQAchievementInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerQQAchievementStats.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
    public static PlayerQQAchievementInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerQQAchievementInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerQQAchievementStats.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
}
