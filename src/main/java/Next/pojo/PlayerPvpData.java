// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerPvpData(
    PlayerPvpHisCli pvpHisCli,
    List<PlayerPvpData_BaseId2Cnt> petBaseId2cnt,
    List<PvpRecord> records,
    int pvpScore,
    int nextRefreshTime,
    List<Integer> receivedAwards,
    PlayerPkInfo pkInfo,
    int dailyPvpFirstWinTime,
    String lastPvpBattleAiDesc,
    int lastBattlePvpType,
    List<RankSeasonInfo> rankSeasonInfos,
    int lastWarmPvpTime,
    TopMasterRankInfo topMasterRankInfo,
    List<PvpPetDamageInfo> petDamageInfo
) {
    public static PlayerPvpData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPvpData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPvpHisCli.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerPvpData_BaseId2Cnt::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PvpRecord::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 7),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerPkInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.RankSeasonInfo::parseFrom).toList(),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.TopMasterRankInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.PvpPetDamageInfo::parseFrom).toList()
        );
    }
    public static PlayerPvpData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPvpData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPvpHisCli.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerPvpData_BaseId2Cnt::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PvpRecord::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 7),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerPkInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.RankSeasonInfo::parseFrom).toList(),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.TopMasterRankInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.PvpPetDamageInfo::parseFrom).toList()
        );
    }
}
