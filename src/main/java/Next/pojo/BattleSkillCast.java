// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleSkillCast(
    int casterId,
    List<Integer> targetId,
    int skillId,
    List<Integer> restraintType,
    int realPerformId,
    int casterUin,
    int type,
    boolean isInterupt,
    int changeTargetId,
    int performFlag,
    int resonancePetId
) {
    public static BattleSkillCast parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSkillCast(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7, 0),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static BattleSkillCast parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSkillCast(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7, 0),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
