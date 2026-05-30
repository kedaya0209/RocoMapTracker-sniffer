// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityStageData_SubRewardData(
    int stageIndex,
    boolean isRewardTaken,
    int loginTimestamp
) {
    public static PlayerActivityInfo_ActivityStageData_SubRewardData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityStageData_SubRewardData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerActivityInfo_ActivityStageData_SubRewardData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityStageData_SubRewardData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
