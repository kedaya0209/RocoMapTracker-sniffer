// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BloodPetFight(
    List<FightMemberInfo> memberInfo,
    int bloodPetBaseId,
    int flowerNpcLevel,
    boolean isGlass,
    GlassInfo glassInfo,
    boolean isShiny,
    int blood,
    int flowerCatchVitem,
    int battleNpcLv,
    int battleNpcHpTalent,
    int battleNpcAttackTalent,
    int battleNpcSpecialAttackTalent,
    int battleNpcDefenseTalent,
    int battleNpcSpecialDefenseTalent,
    int battleNpcSpeedTalent,
    int battleNpcGender,
    int battleNpcNature,
    int catchVitemQuantity,
    int specFlowerSeedId,
    int activityId,
    boolean isFirstCatch,
    int star,
    int cliStartupChannel,
    List<InnerBattleTask> battleTasks,
    int bindPetGid,
    int ownerUin,
    int medalId
) {
    public static BloodPetFight parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BloodPetFight(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FightMemberInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 22) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readBool(fields, 19),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readBool(fields, 21),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 23),
            Pojos.readMessageList(fields, 24).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 27)
        );
    }
    public static BloodPetFight parseFrom(java.util.List<ProtoField> fields) {
        return new BloodPetFight(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FightMemberInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 22) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readBool(fields, 19),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readBool(fields, 21),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 23),
            Pojos.readMessageList(fields, 24).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 27)
        );
    }
}
