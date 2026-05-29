// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ChallengeTarget(
    int targetId,
    boolean isFinish,
    int tempState
) {
    public static PlayerActivityInfo_ChallengeTarget parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ChallengeTarget(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static PlayerActivityInfo_ChallengeTarget parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ChallengeTarget(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
