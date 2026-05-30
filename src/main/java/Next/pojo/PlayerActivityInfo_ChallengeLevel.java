// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ChallengeLevel(
    int challengeId,
    boolean isFinish,
    List<PlayerActivityInfo_ChallengeTarget> targets,
    int takeTimes,
    int finishTimestamp,
    int levelNumber,
    boolean isUnlock
) {
    public static PlayerActivityInfo_ChallengeLevel parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ChallengeLevel(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeTarget::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7)
        );
    }
    public static PlayerActivityInfo_ChallengeLevel parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ChallengeLevel(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ChallengeTarget::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7)
        );
    }
}
