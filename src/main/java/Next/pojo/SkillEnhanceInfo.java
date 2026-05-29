// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SkillEnhanceInfo(
    int buffId,
    int buffbaseId,
    List<Integer> effectIds,
    int cm,
    int tipId,
    int skillId,
    int stack,
    int skillType,
    List<EnhanceEffectInfo> effects,
    int casterPetBaseId
) {
    public static SkillEnhanceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SkillEnhanceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.EnhanceEffectInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10)
        );
    }
    public static SkillEnhanceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SkillEnhanceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.EnhanceEffectInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10)
        );
    }
}
