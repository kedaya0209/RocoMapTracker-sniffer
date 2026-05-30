// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FlowerSeedBossData(
    long seedNpcLogicId,
    int seedStar,
    int innerPetbaseId,
    boolean innerGlass,
    boolean randedBattleNpcGlass,
    boolean innerShiny,
    GlassInfo innerGlassInfo,
    int innerPetLv,
    int innerPetHpTalent,
    int innerPetAttackTalent,
    int innerPetSpecialAttackTalent,
    int innerPetDefenseTalent,
    int innerPetSpecialDefenseTalent,
    int innerPetSpeedTalent,
    int innerPetGender,
    int innerPetNature,
    int catchVitemQuantity,
    int specFlowerSeedId,
    int activityId,
    int endTimestamp,
    int battleStarRule,
    int battleStarOffset,
    int minStar,
    List<InnerBattleTask> battleTasks,
    int bindPetGid,
    int bindPetbaseId,
    int bindEvolutionId,
    long ownerId,
    int blood,
    int campCfgId,
    int seedNpcCfgId,
    long seedNpcObjId,
    int medalId
) {
    public static FlowerSeedBossData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FlowerSeedBossData(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 17),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
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
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readMessageList(fields, 24).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readLong(fields, 28),
            Pojos.readInt(fields, 29),
            Pojos.readInt(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readLong(fields, 32),
            Pojos.readInt(fields, 33)
        );
    }
    public static FlowerSeedBossData parseFrom(java.util.List<ProtoField> fields) {
        return new FlowerSeedBossData(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 17),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
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
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readMessageList(fields, 24).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readLong(fields, 28),
            Pojos.readInt(fields, 29),
            Pojos.readInt(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readLong(fields, 32),
            Pojos.readInt(fields, 33)
        );
    }
}
