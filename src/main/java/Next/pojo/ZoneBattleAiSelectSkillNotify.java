// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleAiSelectSkillNotify(
    int petId,
    BattleAISelectSkillInfo skillInfo
) {
    public static ZoneBattleAiSelectSkillNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleAiSelectSkillNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleAISelectSkillInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneBattleAiSelectSkillNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleAiSelectSkillNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleAISelectSkillInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
