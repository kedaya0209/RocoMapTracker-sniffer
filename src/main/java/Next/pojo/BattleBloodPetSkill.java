// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleBloodPetSkill(
    BattleBloodPetSkill_SkillPkInfo pkinfo,
    List<BattleBloodPetSkill_SkillInfo> skills
) {
    public static BattleBloodPetSkill parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleBloodPetSkill(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleBloodPetSkill_SkillPkInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleBloodPetSkill_SkillInfo::parseFrom).toList()
        );
    }
    public static BattleBloodPetSkill parseFrom(java.util.List<ProtoField> fields) {
        return new BattleBloodPetSkill(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleBloodPetSkill_SkillPkInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleBloodPetSkill_SkillInfo::parseFrom).toList()
        );
    }
}
