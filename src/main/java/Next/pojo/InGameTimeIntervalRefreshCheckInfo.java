// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InGameTimeIntervalRefreshCheckInfo(
    int timeIntervalId,
    boolean inTimeChecked,
    boolean notInTimeChecked
) {
    public static InGameTimeIntervalRefreshCheckInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InGameTimeIntervalRefreshCheckInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static InGameTimeIntervalRefreshCheckInfo parseFrom(java.util.List<ProtoField> fields) {
        return new InGameTimeIntervalRefreshCheckInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
