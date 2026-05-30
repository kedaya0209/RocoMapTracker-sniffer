// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_Avatar(
    ActorInfo_Base base,
    ActorInfo_AvatarAttrs attrs,
    ActorInfo_Mount mount,
    ActorInfo_Story story,
    ActorInfo_AvatarInteract avatarInteract,
    ActorInfo_AvatarDetailStatus avatarStatus,
    List<ActorInfo_Aura> auraInfos,
    List<ActorInfo_ThrowedPet> throwedPetInfos,
    List<ActorInfo_LogicStatus> statusInfo,
    ActorInfo_GameTime gameTimeInfos,
    ActorInfo_AvatarWeather weatherInfo,
    ActorInfo_ScenePets scenePetInfo,
    ActorInfo_Buffs buffInfo,
    ActorInfo_WorldMap worldMapInfo,
    ActorInfo_Card cardInfo,
    ActorInfo_NpcGuide guideInfo,
    ActorInfo_NpcFollow followInfo,
    ActorInfo_Handbook handbookInfo,
    ActorInfo_TaskState taskStateInfo,
    ActorInfo_MagicCreateNpc magicCreateNpcInfo,
    List<Integer> fashionItemWearData,
    List<SalonItemWearData> salonItemWearData,
    ActorInfo_MoveInfo moveInfo,
    ActorInfo_AirWall airWall,
    ActorInfo_HomeBasicInfo homeBasicInfo,
    ActorInfo_HomePlantInfo homePlantInfo,
    ActorInfo_InnerBattle innerBattle,
    ActorInfo_StealHomeInfo stealHomeInfo,
    ActorInfo_RelationInteract relationInteract,
    List<ActorInfo_AOwlSanctuary> uinOwlSanctuaryInfo,
    ActorInfo_CatchRecordInfo catchRecordInfo,
    List<PlayerAppearanceInfo_FashionInfo_WardrobeItem> wearingItem
) {
    public static ActorInfo_Avatar parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Avatar(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_AvatarAttrs.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_Mount.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_Story.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_AvatarInteract.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ActorInfo_AvatarDetailStatus.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.ActorInfo_Aura::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.ActorInfo_ThrowedPet::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.ActorInfo_LogicStatus::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ActorInfo_GameTime.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.ActorInfo_AvatarWeather.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.ActorInfo_ScenePets.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.ActorInfo_Buffs.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.ActorInfo_WorldMap.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.ActorInfo_Card.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.ActorInfo_NpcGuide.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.ActorInfo_NpcFollow.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.ActorInfo_Handbook.parseFrom(Pojos.readMessage(fields, 23)) : null,
            Pojos.readMessage(fields, 24) != null ? Next.pojo.ActorInfo_TaskState.parseFrom(Pojos.readMessage(fields, 24)) : null,
            Pojos.readMessage(fields, 25) != null ? Next.pojo.ActorInfo_MagicCreateNpc.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readIntList(fields, 27),
            Pojos.readMessageList(fields, 28).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readMessage(fields, 29) != null ? Next.pojo.ActorInfo_MoveInfo.parseFrom(Pojos.readMessage(fields, 29)) : null,
            Pojos.readMessage(fields, 30) != null ? Next.pojo.ActorInfo_AirWall.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readMessage(fields, 31) != null ? Next.pojo.ActorInfo_HomeBasicInfo.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readMessage(fields, 32) != null ? Next.pojo.ActorInfo_HomePlantInfo.parseFrom(Pojos.readMessage(fields, 32)) : null,
            Pojos.readMessage(fields, 33) != null ? Next.pojo.ActorInfo_InnerBattle.parseFrom(Pojos.readMessage(fields, 33)) : null,
            Pojos.readMessage(fields, 34) != null ? Next.pojo.ActorInfo_StealHomeInfo.parseFrom(Pojos.readMessage(fields, 34)) : null,
            Pojos.readMessage(fields, 35) != null ? Next.pojo.ActorInfo_RelationInteract.parseFrom(Pojos.readMessage(fields, 35)) : null,
            Pojos.readMessageList(fields, 36).stream().map(Next.pojo.ActorInfo_AOwlSanctuary::parseFrom).toList(),
            Pojos.readMessage(fields, 37) != null ? Next.pojo.ActorInfo_CatchRecordInfo.parseFrom(Pojos.readMessage(fields, 37)) : null,
            Pojos.readMessageList(fields, 38).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
    public static ActorInfo_Avatar parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Avatar(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_AvatarAttrs.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_Mount.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_Story.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_AvatarInteract.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ActorInfo_AvatarDetailStatus.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.ActorInfo_Aura::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.ActorInfo_ThrowedPet::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.ActorInfo_LogicStatus::parseFrom).toList(),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ActorInfo_GameTime.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.ActorInfo_AvatarWeather.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.ActorInfo_ScenePets.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.ActorInfo_Buffs.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.ActorInfo_WorldMap.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.ActorInfo_Card.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.ActorInfo_NpcGuide.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.ActorInfo_NpcFollow.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.ActorInfo_Handbook.parseFrom(Pojos.readMessage(fields, 23)) : null,
            Pojos.readMessage(fields, 24) != null ? Next.pojo.ActorInfo_TaskState.parseFrom(Pojos.readMessage(fields, 24)) : null,
            Pojos.readMessage(fields, 25) != null ? Next.pojo.ActorInfo_MagicCreateNpc.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readIntList(fields, 27),
            Pojos.readMessageList(fields, 28).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readMessage(fields, 29) != null ? Next.pojo.ActorInfo_MoveInfo.parseFrom(Pojos.readMessage(fields, 29)) : null,
            Pojos.readMessage(fields, 30) != null ? Next.pojo.ActorInfo_AirWall.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readMessage(fields, 31) != null ? Next.pojo.ActorInfo_HomeBasicInfo.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readMessage(fields, 32) != null ? Next.pojo.ActorInfo_HomePlantInfo.parseFrom(Pojos.readMessage(fields, 32)) : null,
            Pojos.readMessage(fields, 33) != null ? Next.pojo.ActorInfo_InnerBattle.parseFrom(Pojos.readMessage(fields, 33)) : null,
            Pojos.readMessage(fields, 34) != null ? Next.pojo.ActorInfo_StealHomeInfo.parseFrom(Pojos.readMessage(fields, 34)) : null,
            Pojos.readMessage(fields, 35) != null ? Next.pojo.ActorInfo_RelationInteract.parseFrom(Pojos.readMessage(fields, 35)) : null,
            Pojos.readMessageList(fields, 36).stream().map(Next.pojo.ActorInfo_AOwlSanctuary::parseFrom).toList(),
            Pojos.readMessage(fields, 37) != null ? Next.pojo.ActorInfo_CatchRecordInfo.parseFrom(Pojos.readMessage(fields, 37)) : null,
            Pojos.readMessageList(fields, 38).stream().map(Next.pojo.PlayerAppearanceInfo_FashionInfo_WardrobeItem::parseFrom).toList()
        );
    }
}
