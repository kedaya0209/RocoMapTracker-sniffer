// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleOpHistory(
    List<SkillCastRecord> skills,
    List<ChangePetRecord> changePets,
    List<BuffRecord> buffs,
    List<DamageRecord> damages,
    List<RoleMagicRecord> roleMagics
) {
    public static BattleOpHistory parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleOpHistory(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SkillCastRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ChangePetRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BuffRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.DamageRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.RoleMagicRecord::parseFrom).toList()
        );
    }
    public static BattleOpHistory parseFrom(java.util.List<ProtoField> fields) {
        return new BattleOpHistory(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SkillCastRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ChangePetRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BuffRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.DamageRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.RoleMagicRecord::parseFrom).toList()
        );
    }
}
