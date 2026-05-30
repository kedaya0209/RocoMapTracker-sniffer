// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActionBonusInfo(
    int actionBonusId,
    int baseCfgId,
    int actionNum,
    int bonusNum,
    int bonusTime,
    List<ActionBonusCond> openCond,
    List<ActionBonusCond> closeCond,
    List<Integer> probScaleUpValue,
    List<Integer> deltaProbScaleUpValue,
    int deltaProb,
    long resetTimestamp,
    BonusEventPoolPetCondInfo petCondInfo,
    BonusSelectTestResult bonusSelectTestResult
) {
    public static ActionBonusInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActionBonusInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.ActionBonusCond::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.ActionBonusCond::parseFrom).toList(),
            Pojos.readIntList(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BonusEventPoolPetCondInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.BonusSelectTestResult.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
    public static ActionBonusInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActionBonusInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.ActionBonusCond::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.ActionBonusCond::parseFrom).toList(),
            Pojos.readIntList(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BonusEventPoolPetCondInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.BonusSelectTestResult.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
}
