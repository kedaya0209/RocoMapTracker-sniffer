// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivitySeasonCheckinRewardData(
    int activityRewardsIndex,
    int state
) {
    public static PlayerActivityInfo_ActivitySeasonCheckinRewardData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivitySeasonCheckinRewardData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static PlayerActivityInfo_ActivitySeasonCheckinRewardData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivitySeasonCheckinRewardData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
