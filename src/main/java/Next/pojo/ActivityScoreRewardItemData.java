// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActivityScoreRewardItemData(
    int activityRewardsIndex,
    int state
) {
    public static ActivityScoreRewardItemData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityScoreRewardItemData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ActivityScoreRewardItemData parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityScoreRewardItemData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
