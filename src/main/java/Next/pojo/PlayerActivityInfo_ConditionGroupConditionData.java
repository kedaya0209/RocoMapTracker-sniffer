// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ConditionGroupConditionData(
    int conditionId,
    int rewardState
) {
    public static PlayerActivityInfo_ConditionGroupConditionData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ConditionGroupConditionData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static PlayerActivityInfo_ConditionGroupConditionData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ConditionGroupConditionData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
