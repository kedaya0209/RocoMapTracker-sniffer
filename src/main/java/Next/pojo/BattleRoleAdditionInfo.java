// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleRoleAdditionInfo(
    List<PetCatchInfo> petCatchInfo,
    List<Integer> handbookId,
    List<Integer> handbookLevel,
    BattleFashionInfo appearanceInfo,
    List<BattleRoundFlowReq> comboCmd,
    BattleTlogInfo battleTlogInfo,
    List<Integer> worldNum,
    int petNum,
    int deadPetNum,
    PvpRankInfo pvpRankInfo,
    long aiSkillEvent,
    boolean legendaryBattleIsPerform,
    boolean isMirrorTeam,
    int visitShinyCatchTimes,
    String lastPvpBattleAiDesc,
    int lastPvpBattleType,
    int randomPetNum,
    int deadRandomPetNum,
    int lastWarmPvpTime,
    int defeatPoint,
    int ticketId,
    int ticketNum,
    int settlePoint,
    boolean hasSpecFlowerMedal
) {
    public static BattleRoleAdditionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoleAdditionInfo(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetCatchInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.BattleRoundFlowReq::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BattleTlogInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PvpRankInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readString(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readBool(fields, 25)
        );
    }
    public static BattleRoleAdditionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoleAdditionInfo(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetCatchInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.BattleRoundFlowReq::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BattleTlogInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PvpRankInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readString(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readBool(fields, 25)
        );
    }
}
