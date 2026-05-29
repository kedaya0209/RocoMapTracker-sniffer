// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityStageData_SubData(
    int activityStageId,
    boolean isDisposableRewardTaken,
    List<PlayerActivityInfo_ActivityStageData_SubRewardData> rewardData,
    int stageTimestamp,
    int openTimestamp,
    int enterSceneTime,
    int totalStageDays,
    boolean active
) {
    public static PlayerActivityInfo_ActivityStageData_SubData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityStageData_SubData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ActivityStageData_SubRewardData::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8)
        );
    }
    public static PlayerActivityInfo_ActivityStageData_SubData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityStageData_SubData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerActivityInfo_ActivityStageData_SubRewardData::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8)
        );
    }
}
