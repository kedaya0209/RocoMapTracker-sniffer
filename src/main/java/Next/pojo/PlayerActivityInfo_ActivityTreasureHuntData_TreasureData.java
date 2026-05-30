// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityTreasureHuntData_TreasureData(
    int activitySubId,
    int rewardState,
    List<Boolean> ridePetUnlock,
    boolean isEnter
) {
    public static PlayerActivityInfo_ActivityTreasureHuntData_TreasureData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityTreasureHuntData_TreasureData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readBoolList(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static PlayerActivityInfo_ActivityTreasureHuntData_TreasureData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityTreasureHuntData_TreasureData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readBoolList(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
