// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcRefresher(
    List<AvatarNpcRefreshInfo_Refresh> refreshInfoList,
    List<InGameTimeIntervalRefreshCheckInfo> ingameRefreshCheckList,
    List<CampRefreshPetEggInfo> campPetEggInfo,
    List<OwlSanctuaryPetEggInfo> owlSanctuaryPetEggInfo,
    NpcBlockData wideBlockData,
    NpcBlockDataList advanceBlockDatas,
    List<PendingDeleteNpc> deleteNpcList,
    List<AreaNpcData> areaNpcDatas,
    List<Integer> enteredSceneCfgId,
    int registTime,
    PendingEraseContentList pendingEraseContentList,
    int lastGlassResetTime,
    int createGlassNpcNum,
    int lastNightmareResetTime,
    int createNightmareNpcNum
) {
    public static ActorCompData_NpcRefresher parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcRefresher(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AvatarNpcRefreshInfo_Refresh::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InGameTimeIntervalRefreshCheckInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.CampRefreshPetEggInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.OwlSanctuaryPetEggInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.NpcBlockData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.NpcBlockDataList.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.PendingDeleteNpc::parseFrom).toList(),
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.AreaNpcData::parseFrom).toList(),
            Pojos.readIntList(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PendingEraseContentList.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24)
        );
    }
    public static ActorCompData_NpcRefresher parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcRefresher(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AvatarNpcRefreshInfo_Refresh::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InGameTimeIntervalRefreshCheckInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.CampRefreshPetEggInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.OwlSanctuaryPetEggInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.NpcBlockData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.NpcBlockDataList.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.PendingDeleteNpc::parseFrom).toList(),
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.AreaNpcData::parseFrom).toList(),
            Pojos.readIntList(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PendingEraseContentList.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24)
        );
    }
}
