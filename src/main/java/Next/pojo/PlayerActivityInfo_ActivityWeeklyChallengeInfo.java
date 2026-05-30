// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityWeeklyChallengeInfo(
    int challengeId,
    boolean isClear,
    int highestCheerPoint,
    int challengeTimes,
    int targetCheerPoint
) {
    public static PlayerActivityInfo_ActivityWeeklyChallengeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityWeeklyChallengeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static PlayerActivityInfo_ActivityWeeklyChallengeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityWeeklyChallengeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
