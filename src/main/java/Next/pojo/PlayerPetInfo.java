// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerPetInfo(
    List<PetData> petData,
    List<PetCatchInfo> catchInfo,
    int generationGid,
    int fellowGid,
    List<Integer> bagPosGid,
    byte[] seenMonsterBits,
    PetTeamInfo teamInfo,
    PetHandbook handbook,
    PetBackpackInfo backpackInfo,
    PetHabitInfo habitInfo,
    PetStatisticsInfo statisticsInfo,
    List<PetTravelInfo> travelInfo,
    int visitRemainCatchTimes,
    int nextVisitCatchRefreshTime,
    List<PetTeamInfo> teamInfos,
    int visitRemainShinyCatchTimes,
    int lastVisitShinyCatchRefreshTime,
    DeletedPetList deletedPetList,
    List<HomePetInfo> homePetInfo,
    long version,
    List<Integer> pseudoEggShinyCumProb,
    GiftEggList giftEggList,
    List<PetReportInfo> petReportInfo,
    int lastWriteFriendDbTime,
    List<PetData> mirrorPetData,
    int petOncePatchVersion,
    List<RankSeasonPetUseInfo> petUseInfo,
    List<PetBacktrack> backtrackInfo,
    List<Integer> pseudoEggGlassCumProb,
    CliPetMedalInfo petMedalInfo,
    PetTaskInfo petTaskInfo,
    PlayerPetMonitorInfo monitorInfo,
    int currentSelectPetGid
) {
    public static PlayerPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPetInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetCatchInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetTeamInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PetHandbook.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PetBackpackInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetHabitInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PetStatisticsInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.PetTravelInfo::parseFrom).toList(),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.PetTeamInfo::parseFrom).toList(),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.DeletedPetList.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessageList(fields, 22).stream().map(Next.pojo.HomePetInfo::parseFrom).toList(),
            Pojos.readLong(fields, 23),
            Pojos.readIntList(fields, 24),
            Pojos.readMessage(fields, 25) != null ? Next.pojo.GiftEggList.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readMessageList(fields, 26).stream().map(Next.pojo.PetReportInfo::parseFrom).toList(),
            Pojos.readInt(fields, 27),
            Pojos.readMessageList(fields, 28).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 29),
            Pojos.readMessageList(fields, 30).stream().map(Next.pojo.RankSeasonPetUseInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 31).stream().map(Next.pojo.PetBacktrack::parseFrom).toList(),
            Pojos.readIntList(fields, 32),
            Pojos.readMessage(fields, 33) != null ? Next.pojo.CliPetMedalInfo.parseFrom(Pojos.readMessage(fields, 33)) : null,
            Pojos.readMessage(fields, 34) != null ? Next.pojo.PetTaskInfo.parseFrom(Pojos.readMessage(fields, 34)) : null,
            Pojos.readMessage(fields, 35) != null ? Next.pojo.PlayerPetMonitorInfo.parseFrom(Pojos.readMessage(fields, 35)) : null,
            Pojos.readInt(fields, 36)
        );
    }
    public static PlayerPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPetInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetCatchInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetTeamInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PetHandbook.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PetBackpackInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetHabitInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PetStatisticsInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.PetTravelInfo::parseFrom).toList(),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.PetTeamInfo::parseFrom).toList(),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.DeletedPetList.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessageList(fields, 22).stream().map(Next.pojo.HomePetInfo::parseFrom).toList(),
            Pojos.readLong(fields, 23),
            Pojos.readIntList(fields, 24),
            Pojos.readMessage(fields, 25) != null ? Next.pojo.GiftEggList.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readMessageList(fields, 26).stream().map(Next.pojo.PetReportInfo::parseFrom).toList(),
            Pojos.readInt(fields, 27),
            Pojos.readMessageList(fields, 28).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 29),
            Pojos.readMessageList(fields, 30).stream().map(Next.pojo.RankSeasonPetUseInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 31).stream().map(Next.pojo.PetBacktrack::parseFrom).toList(),
            Pojos.readIntList(fields, 32),
            Pojos.readMessage(fields, 33) != null ? Next.pojo.CliPetMedalInfo.parseFrom(Pojos.readMessage(fields, 33)) : null,
            Pojos.readMessage(fields, 34) != null ? Next.pojo.PetTaskInfo.parseFrom(Pojos.readMessage(fields, 34)) : null,
            Pojos.readMessage(fields, 35) != null ? Next.pojo.PlayerPetMonitorInfo.parseFrom(Pojos.readMessage(fields, 35)) : null,
            Pojos.readInt(fields, 36)
        );
    }
}
