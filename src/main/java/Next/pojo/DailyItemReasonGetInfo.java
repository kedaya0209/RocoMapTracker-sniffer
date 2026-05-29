// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DailyItemReasonGetInfo(
    int guardId,
    int totalNum,
    int totalTimes,
    boolean hasLimited
) {
    public static DailyItemReasonGetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DailyItemReasonGetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static DailyItemReasonGetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DailyItemReasonGetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
