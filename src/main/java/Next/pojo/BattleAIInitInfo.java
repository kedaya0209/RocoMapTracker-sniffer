// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleAIInitInfo(
    int tod,
    int sleeping,
    int newSkill,
    int predictType,
    int nightHabit,
    long aiStatus,
    int preActTag,
    int preActParam
) {
    public static BattleAIInitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleAIInitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static BattleAIInitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleAIInitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
