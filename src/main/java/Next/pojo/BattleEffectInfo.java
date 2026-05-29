// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleEffectInfo(
    int effectId,
    int castMoment,
    int resultType,
    int resultData1,
    int resultData2,
    List<Integer> resultArr,
    List<Integer> resultArr2,
    int processState,
    int triggerSkillId,
    int triggerSkillTarget
) {
    public static BattleEffectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleEffectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
    public static BattleEffectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleEffectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
}
