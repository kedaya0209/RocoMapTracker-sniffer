// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityConditionGroupData(
    int rewardState,
    List<PlayerActivityInfo_ConditionGroupSingleData> groupData
) {
    public static PlayerActivityInfo_ActivityConditionGroupData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityConditionGroupData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ConditionGroupSingleData::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityConditionGroupData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityConditionGroupData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ConditionGroupSingleData::parseFrom).toList()
        );
    }
}
