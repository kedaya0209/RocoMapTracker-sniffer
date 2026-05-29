// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BadgeChallengeData(
    int levelId,
    ChallengeEventCardInfo curEvent,
    int remainCoin,
    List<Integer> chosenUpgradeId,
    List<BadgeChallengePetInfo> petInfo,
    List<Integer> petGids,
    int curNodeIndex,
    List<ChallengeEventCardInfo> availableEventCards,
    List<ChallengeEventCardInfo> handsCards,
    int refreshNeedCoin,
    int handsCardsNum,
    int showBuffNum,
    int rerollCostAdd,
    ChallengeEventCardInfo newCard,
    List<Integer> availableUpgradeIds,
    List<BadgeChallengeLevelInfo> levelInfos,
    int lastGid,
    List<Integer> usedCardsGid,
    int curPetLevel
) {
    public static BadgeChallengeData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BadgeChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ChallengeEventCardInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BadgeChallengePetInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ChallengeEventCardInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readIntList(fields, 15),
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.BadgeChallengeLevelInfo::parseFrom).toList(),
            Pojos.readInt(fields, 17),
            Pojos.readIntList(fields, 18),
            Pojos.readInt(fields, 19)
        );
    }
    public static BadgeChallengeData parseFrom(java.util.List<ProtoField> fields) {
        return new BadgeChallengeData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ChallengeEventCardInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BadgeChallengePetInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ChallengeEventCardInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readIntList(fields, 15),
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.BadgeChallengeLevelInfo::parseFrom).toList(),
            Pojos.readInt(fields, 17),
            Pojos.readIntList(fields, 18),
            Pojos.readInt(fields, 19)
        );
    }
}
