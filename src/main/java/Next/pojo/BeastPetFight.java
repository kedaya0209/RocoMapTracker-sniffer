// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BeastPetFight(
    List<FightMemberInfo> memberInfo,
    int star,
    int battleCfgId,
    boolean reEntrant,
    int ballNum,
    int bossShiny,
    PetData boss,
    int lastState,
    long lastCatchTime,
    int prevGuaranteeRate,
    boolean isPerform,
    int activityId,
    GlassInfo glassInfo,
    boolean isSeasonBattle,
    List<BeastResonanceInfo> resonanceInfos
) {
    public static BeastPetFight parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BeastPetFight(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FightMemberInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readBool(fields, 15),
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.BeastResonanceInfo::parseFrom).toList()
        );
    }
    public static BeastPetFight parseFrom(java.util.List<ProtoField> fields) {
        return new BeastPetFight(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FightMemberInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readBool(fields, 15),
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.BeastResonanceInfo::parseFrom).toList()
        );
    }
}
