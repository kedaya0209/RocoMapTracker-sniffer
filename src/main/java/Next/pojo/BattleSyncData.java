// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleSyncData(
    List<BattleRoleSyncInfo> roleSyncInfo,
    List<BattlePetSyncInfo> petSyncInfo,
    List<BattleSkillSyncInfo> skillSyncInfo,
    List<BattleCommSyncInfo> commSyncInfo,
    List<BattleSkillChangeSyncInfo> skillChangeSyncInfo,
    List<BattlePetInfo> petInfo,
    List<BattleItemSyncInfo> itemSyncInfo,
    List<BattleTaskInfo> taskInfos
) {
    public static BattleSyncData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSyncData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleRoleSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattlePetSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleSkillSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleCommSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BattleSkillChangeSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.BattleItemSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.BattleTaskInfo::parseFrom).toList()
        );
    }
    public static BattleSyncData parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSyncData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleRoleSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattlePetSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleSkillSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleCommSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BattleSkillChangeSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.BattleItemSyncInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.BattleTaskInfo::parseFrom).toList()
        );
    }
}
