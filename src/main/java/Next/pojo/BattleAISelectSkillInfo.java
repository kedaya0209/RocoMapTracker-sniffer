// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleAISelectSkillInfo(
    int uin,
    int hintLevel,
    int npcHintMode,
    int skillFeature,
    int costEnergy,
    int damType,
    int skillId,
    List<Integer> skillTargets,
    boolean showSkillFeature,
    boolean showCostEnergy,
    boolean showDamType,
    boolean showSkillId,
    boolean noShow,
    boolean showWord,
    int skillId2,
    int wordConfId,
    int wordConfIndex
) {
    public static BattleAISelectSkillInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleAISelectSkillInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16)
        );
    }
    public static BattleAISelectSkillInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleAISelectSkillInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16)
        );
    }
}
