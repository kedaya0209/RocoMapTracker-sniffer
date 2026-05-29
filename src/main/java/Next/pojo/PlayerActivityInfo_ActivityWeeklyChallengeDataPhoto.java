// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto(
    int photoTemplateId,
    List<Integer> petConfId,
    List<Integer> petGid,
    long timestamp,
    List<Integer> animePercent
) {
    public static PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
