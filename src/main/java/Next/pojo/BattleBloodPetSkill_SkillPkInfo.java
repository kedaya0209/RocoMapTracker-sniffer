// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleBloodPetSkill_SkillPkInfo(
    int skillId,
    int attackPetId,
    boolean hide,
    List<BattleOpRecord> items,
    List<CliSimpleBattlePet> simplePets
) {
    public static BattleBloodPetSkill_SkillPkInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleBloodPetSkill_SkillPkInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleOpRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.CliSimpleBattlePet::parseFrom).toList()
        );
    }
    public static BattleBloodPetSkill_SkillPkInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleBloodPetSkill_SkillPkInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleOpRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.CliSimpleBattlePet::parseFrom).toList()
        );
    }
}
