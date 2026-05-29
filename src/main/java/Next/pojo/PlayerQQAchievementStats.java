// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerQQAchievementStats(
    long usePetBallNum
) {
    public static PlayerQQAchievementStats parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerQQAchievementStats(
            Pojos.readLong(fields, 1)
        );
    }
    public static PlayerQQAchievementStats parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerQQAchievementStats(
            Pojos.readLong(fields, 1)
        );
    }
}
