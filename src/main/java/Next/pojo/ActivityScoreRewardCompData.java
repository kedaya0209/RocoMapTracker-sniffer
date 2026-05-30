// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActivityScoreRewardCompData(
    List<ActivityScoreRewardItemData> rewardData
) {
    public static ActivityScoreRewardCompData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityScoreRewardCompData(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActivityScoreRewardItemData::parseFrom).toList()
        );
    }
    public static ActivityScoreRewardCompData parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityScoreRewardCompData(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActivityScoreRewardItemData::parseFrom).toList()
        );
    }
}
