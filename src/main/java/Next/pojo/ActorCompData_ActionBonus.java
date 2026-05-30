// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_ActionBonus(
    List<ActionBonusInfo> actionBonuses,
    ActionBonusCampPetReportInfo campPetReportInfo,
    ActionBonusPityInfo pityInfo,
    int c1BonusCount,
    int c1ShiningCount,
    int c1Inj,
    int c1ResetThreshold,
    int bonusShinningStgCfgId,
    int catchTimesUntilBonus,
    int visitingCatchTimesUntilBonus,
    int togetherCatchTimesUntilBonus,
    int catchTimesUntilShinBonus,
    long bonusTimestamp
) {
    public static ActorCompData_ActionBonus parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_ActionBonus(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActionBonusInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActionBonusCampPetReportInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActionBonusPityInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 104),
            Pojos.readInt(fields, 105),
            Pojos.readInt(fields, 106),
            Pojos.readInt(fields, 107),
            Pojos.readLong(fields, 108)
        );
    }
    public static ActorCompData_ActionBonus parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_ActionBonus(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActionBonusInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActionBonusCampPetReportInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActionBonusPityInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 104),
            Pojos.readInt(fields, 105),
            Pojos.readInt(fields, 106),
            Pojos.readInt(fields, 107),
            Pojos.readLong(fields, 108)
        );
    }
}
