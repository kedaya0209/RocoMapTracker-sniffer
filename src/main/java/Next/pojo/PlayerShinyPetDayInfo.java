// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerShinyPetDayInfo(
    int petalNum,
    boolean init,
    int lastRefreshTimestamp,
    int totalDoubleTimes,
    int remainingDouleTimes,
    boolean preDeductDoubleTimes,
    boolean hasPetal,
    int lockActivity
) {
    public static PlayerShinyPetDayInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerShinyPetDayInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static PlayerShinyPetDayInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerShinyPetDayInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
