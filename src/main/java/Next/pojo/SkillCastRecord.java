// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SkillCastRecord(
    int caster,
    int target,
    int skillId,
    int costEnergy,
    int costHp,
    int damageParam,
    int round,
    long damageType,
    boolean isCasterDead,
    boolean isCounter,
    boolean isRapidSkill,
    boolean isCmdSkill,
    boolean isRealCast,
    boolean isCharging,
    int restraintParam,
    boolean isEffect33PullUpSkill,
    List<ExtraDamTypeInfo> extraDamageType,
    int performFlag,
    boolean isAwardCast,
    int adaptDamageType,
    int originalSkillId
) {
    public static SkillCastRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SkillCastRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 13),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 14, 0),
            Pojos.readBool(fields, 16),
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.ExtraDamTypeInfo::parseFrom).toList(),
            Pojos.readInt(fields, 18),
            Pojos.readBool(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21)
        );
    }
    public static SkillCastRecord parseFrom(java.util.List<ProtoField> fields) {
        return new SkillCastRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 13),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 14, 0),
            Pojos.readBool(fields, 16),
            Pojos.readMessageList(fields, 17).stream().map(Next.pojo.ExtraDamTypeInfo::parseFrom).toList(),
            Pojos.readInt(fields, 18),
            Pojos.readBool(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21)
        );
    }
}
