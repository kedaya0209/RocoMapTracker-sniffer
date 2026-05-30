// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityCoCreation(
    int firstCaughtRanking,
    int firstCaughtTimestamp,
    int emojType,
    List<Integer> caughtCamp,
    int rewardState,
    int supplyEggState,
    int taskRewardState,
    List<Integer> emojList
) {
    public static PlayerActivityInfo_ActivityCoCreation parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityCoCreation(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7, 0),
            Pojos.readIntList(fields, 8)
        );
    }
    public static PlayerActivityInfo_ActivityCoCreation parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityCoCreation(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7, 0),
            Pojos.readIntList(fields, 8)
        );
    }
}
