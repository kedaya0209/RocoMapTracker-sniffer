// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TriggerMoveHist(
    long combineId,
    int resetType,
    List<Integer> prevPosInfo,
    boolean isReset
) {
    public static TriggerMoveHist parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TriggerMoveHist(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static TriggerMoveHist parseFrom(java.util.List<ProtoField> fields) {
        return new TriggerMoveHist(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
