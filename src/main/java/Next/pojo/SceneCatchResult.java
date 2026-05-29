// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneCatchResult(
    boolean isCatched,
    int probability,
    int monterLevel,
    MonsterDiffInfo diffInfo,
    boolean isTechSatisfied,
    boolean isDetected,
    int caughtCamp,
    boolean isVisiting,
    String visitOwnerName,
    int caughtWeather,
    long caughtAiStatus,
    int gender,
    boolean useVisitCatchTime
) {
    public static SceneCatchResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneCatchResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.MonsterDiffInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13)
        );
    }
    public static SceneCatchResult parseFrom(java.util.List<ProtoField> fields) {
        return new SceneCatchResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.MonsterDiffInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readBool(fields, 13)
        );
    }
}
