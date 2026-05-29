// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleInitInfo(
    long battleId,
    List<Integer> battleCfgId,
    int battleStartTime,
    int battleState,
    List<BattleRoleInfo> playerTeam,
    List<BattleRoleInfo> enemyTeam,
    int stateBit,
    BattleBloodPetSkill bloodPetSkills,
    int beastStar,
    List<BattleOnlooker> onlookerA,
    List<BattleOnlooker> onlookerB,
    FinalBattleInfo finalBattle,
    WorldLeaderFightInfo worldLeaderFightInfo,
    BattlePveInfo pveInfo,
    ObserveBattleInfo observeBattle,
    List<EvolutionData> evolutionData,
    List<BattleSpecialMoveInfo> specialMove,
    List<BattleOtherRoleInfo> others,
    B1FinalBattleInfo b1FinalBattle,
    LegendaryBattleInfo legendaryBattle,
    List<InnerBattleTask> battleTasks,
    int battlerUin
) {
    public static BattleInitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleInitInfo(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.BattleBloodPetSkill.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.BattleOnlooker::parseFrom).toList(),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.BattleOnlooker::parseFrom).toList(),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.FinalBattleInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.WorldLeaderFightInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.BattlePveInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.ObserveBattleInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessageList(fields, 18).stream().map(Next.pojo.EvolutionData::parseFrom).toList(),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.BattleSpecialMoveInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.BattleOtherRoleInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.B1FinalBattleInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.LegendaryBattleInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessageList(fields, 23).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 24)
        );
    }
    public static BattleInitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleInitInfo(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.BattleBloodPetSkill.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.BattleOnlooker::parseFrom).toList(),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.BattleOnlooker::parseFrom).toList(),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.FinalBattleInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.WorldLeaderFightInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.BattlePveInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.ObserveBattleInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessageList(fields, 18).stream().map(Next.pojo.EvolutionData::parseFrom).toList(),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.BattleSpecialMoveInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.BattleOtherRoleInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.B1FinalBattleInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.LegendaryBattleInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessageList(fields, 23).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 24)
        );
    }
}
