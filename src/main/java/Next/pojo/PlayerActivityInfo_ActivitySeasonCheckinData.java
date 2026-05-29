// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivitySeasonCheckinData(
    List<Integer> actTaskList,
    List<PlayerActivityInfo_ActivitySeasonCheckinRewardData> rewardData
) {
    public static PlayerActivityInfo_ActivitySeasonCheckinData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivitySeasonCheckinData(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivitySeasonCheckinRewardData::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivitySeasonCheckinData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivitySeasonCheckinData(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivitySeasonCheckinRewardData::parseFrom).toList()
        );
    }
}
