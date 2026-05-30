// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeLevelRewardInfo(
    List<RewardState> rewardStates
) {
    public static HomeLevelRewardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeLevelRewardInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RewardState::parseFrom).toList()
        );
    }
    public static HomeLevelRewardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeLevelRewardInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RewardState::parseFrom).toList()
        );
    }
}
