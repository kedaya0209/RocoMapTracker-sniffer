// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BadgeChallengeLevelInfo(
    ChallengeEventCardInfo cardInfo,
    int level
) {
    public static BadgeChallengeLevelInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BadgeChallengeLevelInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ChallengeEventCardInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static BadgeChallengeLevelInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BadgeChallengeLevelInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ChallengeEventCardInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
