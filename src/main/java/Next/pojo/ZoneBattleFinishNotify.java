// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleFinishNotify(
    BattleSettleInfo settleInfo,
    List<Integer> seenMonsterId,
    RetInfo retInfo,
    GoodsReward reward,
    boolean evolutionComplete,
    List<BattleFinishPetInfo> petInfo,
    List<BattleFinishBagInfo> bagInfo,
    boolean willLeaveVisit,
    List<PetCarryonInfo> consumedCarryons,
    List<PvpScoreRecord> pvpScoreRecords,
    int pvpScore,
    PlayerAppearanceInfo_FashionInfo_SuitInfo fashionSuitInfo,
    int totalPvpScore,
    int maxPvpScore,
    List<Integer> worldNums,
    List<CliSimpleBattlePet> simplePets,
    PvpRankSettleInfo pvpRankSettleInfo,
    int createBattleRet,
    int cliStartupChannel,
    int lastPvpBattleType,
    String lastPvpBattleAiDesc,
    List<ObserverPvpScoreRecord> observerPvpScoreRecords,
    BattleFinishObtainMedalInfo obtainMedalInfo,
    BattlePvpScoreInfo battlePvpScore
) {
    public static ZoneBattleFinishNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleFinishNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleSettleInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.BattleFinishPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.BattleFinishBagInfo::parseFrom).toList(),
            Pojos.readBool(fields, 10),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.PetCarryonInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.PvpScoreRecord::parseFrom).toList(),
            Pojos.readInt(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readIntList(fields, 19),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.CliSimpleBattlePet::parseFrom).toList(),
            Pojos.readMessage(fields, 22) != null ? Next.pojo.PvpRankSettleInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 25),
            Pojos.readString(fields, 26),
            Pojos.readMessageList(fields, 27).stream().map(Next.pojo.ObserverPvpScoreRecord::parseFrom).toList(),
            Pojos.readMessage(fields, 28) != null ? Next.pojo.BattleFinishObtainMedalInfo.parseFrom(Pojos.readMessage(fields, 28)) : null,
            Pojos.readMessage(fields, 29) != null ? Next.pojo.BattlePvpScoreInfo.parseFrom(Pojos.readMessage(fields, 29)) : null
        );
    }
    public static ZoneBattleFinishNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleFinishNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleSettleInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.BattleFinishPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.BattleFinishBagInfo::parseFrom).toList(),
            Pojos.readBool(fields, 10),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.PetCarryonInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.PvpScoreRecord::parseFrom).toList(),
            Pojos.readInt(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readIntList(fields, 19),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.CliSimpleBattlePet::parseFrom).toList(),
            Pojos.readMessage(fields, 22) != null ? Next.pojo.PvpRankSettleInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 25),
            Pojos.readString(fields, 26),
            Pojos.readMessageList(fields, 27).stream().map(Next.pojo.ObserverPvpScoreRecord::parseFrom).toList(),
            Pojos.readMessage(fields, 28) != null ? Next.pojo.BattleFinishObtainMedalInfo.parseFrom(Pojos.readMessage(fields, 28)) : null,
            Pojos.readMessage(fields, 29) != null ? Next.pojo.BattlePvpScoreInfo.parseFrom(Pojos.readMessage(fields, 29)) : null
        );
    }
}
