// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBadgeChallengeSettleNotify(
    boolean isFinishChallenge,
    List<Integer> upgradeRewards,
    int coins,
    boolean isWin,
    List<BadgeChallengePetInfo> petInfo,
    int upgradeNum
) {
    public static ZoneBadgeChallengeSettleNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBadgeChallengeSettleNotify(
            Pojos.readBool(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BadgeChallengePetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneBadgeChallengeSettleNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBadgeChallengeSettleNotify(
            Pojos.readBool(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BadgeChallengePetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6)
        );
    }
}
