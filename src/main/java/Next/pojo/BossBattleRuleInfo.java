// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BossBattleRuleInfo(
    long bossObjId,
    List<Integer> ruleIds,
    int level
) {
    public static BossBattleRuleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BossBattleRuleInfo(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static BossBattleRuleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BossBattleRuleInfo(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
