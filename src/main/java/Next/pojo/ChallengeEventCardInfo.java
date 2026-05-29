// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ChallengeEventCardInfo(
    List<Integer> eventIds,
    boolean isUsed,
    boolean isFixed,
    BadgeChallengeReward reward,
    List<Integer> incidentType,
    List<Integer> param1s,
    List<Integer> param2s,
    int gid,
    boolean isSelected,
    int num1,
    int num2,
    int upgradeSelectNum
) {
    public static ChallengeEventCardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChallengeEventCardInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BadgeChallengeReward.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readIntList(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static ChallengeEventCardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ChallengeEventCardInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BadgeChallengeReward.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readIntList(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
