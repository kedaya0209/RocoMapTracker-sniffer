// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityShinyPetDayData(
    int activitySubId,
    int totalCatchNum,
    int fristCaughtRanking,
    int fristCaughtTimestamp,
    int fristCaughtCamp,
    List<Integer> shinyCaughtTimestamps,
    int receivedReward,
    boolean expired,
    int flowerSeedContentId,
    boolean petaled
) {
    public static PlayerActivityInfo_ActivityShinyPetDayData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityShinyPetDayData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBool(fields, 10)
        );
    }
    public static PlayerActivityInfo_ActivityShinyPetDayData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityShinyPetDayData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBool(fields, 10)
        );
    }
}
