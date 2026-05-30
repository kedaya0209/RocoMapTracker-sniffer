// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BadgeChallengeReward(
    int levelRewardValue,
    int coinRewardValue,
    int hpRecoverValue,
    boolean petRecover,
    List<Integer> upgradeReward
) {
    public static BadgeChallengeReward parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BadgeChallengeReward(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static BadgeChallengeReward parseFrom(java.util.List<ProtoField> fields) {
        return new BadgeChallengeReward(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
