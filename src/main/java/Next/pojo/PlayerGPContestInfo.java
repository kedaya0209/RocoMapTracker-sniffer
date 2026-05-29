// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerGPContestInfo(
    int gpContestState,
    int gpContestRankId,
    int gpNumVictory,
    int gpNumAdd,
    List<Boolean> rewardTaken
) {
    public static PlayerGPContestInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerGPContestInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBoolList(fields, 5)
        );
    }
    public static PlayerGPContestInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerGPContestInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBoolList(fields, 5)
        );
    }
}
