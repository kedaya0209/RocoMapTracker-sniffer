// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ConditionGroupSingleData(
    int groupId,
    boolean isFinishAll,
    List<PlayerActivityInfo_ConditionGroupConditionData> condData,
    boolean isUnlock
) {
    public static PlayerActivityInfo_ConditionGroupSingleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ConditionGroupSingleData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ConditionGroupConditionData::parseFrom).toList(),
            Pojos.readBool(fields, 4)
        );
    }
    public static PlayerActivityInfo_ConditionGroupSingleData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ConditionGroupSingleData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ConditionGroupConditionData::parseFrom).toList(),
            Pojos.readBool(fields, 4)
        );
    }
}
