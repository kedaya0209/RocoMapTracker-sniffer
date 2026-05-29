// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_Npc(
    ActorInfo_Base base,
    ActorInfo_NpcAttrs attrs,
    ActorInfo_NpcBase npcBase,
    ActorInfo_DropItem dropItem,
    ActorInfo_NpcInteract npcInteract,
    ActorInfo_CombineLock combineLock,
    ActorInfo_PotentialEnergy potentialEnergyInfo,
    ActorInfo_Pet petInfo,
    ActorInfo_PropertyType propertyTypeInfo,
    List<ActorInfo_LogicStatus> statusInfo,
    List<ActorInfo_NpcPendant> pendantInfo,
    ActorInfo_NpcWeather weatherInfo,
    ActorInfo_CombinePetInteract combineInteractInfo,
    ActorInfo_NpcMisc miscInfo,
    ActorInfo_Buffs buffInfo,
    ActorInfo_AI aiInfo,
    ActorInfo_RelatedNpcInfos relatedNpcInfos,
    ActorInfo_WorldCombat worldCombatInfo,
    ActorInfo_WorldCombatSkill worldCombatSkillInfo,
    ActorInfo_HomePet homePet,
    ActorInfo_AttachItem attachItemInfo
) {
    public static ActorInfo_Npc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Npc(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_NpcAttrs.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_NpcBase.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ActorInfo_DropItem.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_NpcInteract.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_CombineLock.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ActorInfo_PotentialEnergy.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.ActorInfo_Pet.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.ActorInfo_PropertyType.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.ActorInfo_LogicStatus::parseFrom).toList(),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.ActorInfo_NpcPendant::parseFrom).toList(),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.ActorInfo_NpcWeather.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ActorInfo_CombinePetInteract.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ActorInfo_NpcMisc.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.ActorInfo_Buffs.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.ActorInfo_AI.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.ActorInfo_RelatedNpcInfos.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.ActorInfo_WorldCombat.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.ActorInfo_WorldCombatSkill.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.ActorInfo_HomePet.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.ActorInfo_AttachItem.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
    public static ActorInfo_Npc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Npc(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_NpcAttrs.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_NpcBase.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ActorInfo_DropItem.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_NpcInteract.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_CombineLock.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ActorInfo_PotentialEnergy.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.ActorInfo_Pet.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.ActorInfo_PropertyType.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.ActorInfo_LogicStatus::parseFrom).toList(),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.ActorInfo_NpcPendant::parseFrom).toList(),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.ActorInfo_NpcWeather.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ActorInfo_CombinePetInteract.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ActorInfo_NpcMisc.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.ActorInfo_Buffs.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.ActorInfo_AI.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.ActorInfo_RelatedNpcInfos.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.ActorInfo_WorldCombat.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.ActorInfo_WorldCombatSkill.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.ActorInfo_HomePet.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.ActorInfo_AttachItem.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
}
