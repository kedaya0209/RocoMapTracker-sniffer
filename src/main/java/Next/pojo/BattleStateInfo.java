// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleStateInfo(
    long battleId,
    int round,
    int seriesIndex,
    int battleStartTime,
    long roundTime,
    int lastChangePetRound,
    List<BattleRoleInfo> playerTeam,
    List<BattleRoleInfo> enemyTeam,
    List<EvolutionData> evolutionData,
    List<Integer> npcEscape,
    int bossRegisterSkillCnt,
    int pvpRoundLimit,
    boolean isPlayerDishonesty,
    boolean isEnemyDishonesty,
    FinalBattleData finalBattleData,
    WorldLeaderFightInfo worldLeaderFightInfo,
    B1FinalBattleData b1FinalBattleData
) {
    public static BattleStateInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleStateInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.EvolutionData::parseFrom).toList(),
            Pojos.readIntList(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readBool(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.FinalBattleData.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.WorldLeaderFightInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.B1FinalBattleData.parseFrom(Pojos.readMessage(fields, 18)) : null
        );
    }
    public static BattleStateInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleStateInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.BattleRoleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.EvolutionData::parseFrom).toList(),
            Pojos.readIntList(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readBool(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.FinalBattleData.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.WorldLeaderFightInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.B1FinalBattleData.parseFrom(Pojos.readMessage(fields, 18)) : null
        );
    }
}
