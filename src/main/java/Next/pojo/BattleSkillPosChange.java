// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleSkillPosChange(
    int petId,
    List<SkillPosInfo> skillPosInfos
) {
    public static BattleSkillPosChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSkillPosChange(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SkillPosInfo::parseFrom).toList()
        );
    }
    public static BattleSkillPosChange parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSkillPosChange(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SkillPosInfo::parseFrom).toList()
        );
    }
}
