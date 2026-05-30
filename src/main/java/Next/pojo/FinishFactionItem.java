// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FinishFactionItem(
    int faction,
    long finishTime
) {
    public static FinishFactionItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FinishFactionItem(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2)
        );
    }
    public static FinishFactionItem parseFrom(java.util.List<ProtoField> fields) {
        return new FinishFactionItem(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2)
        );
    }
}
