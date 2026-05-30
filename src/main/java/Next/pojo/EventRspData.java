// Generated from nrcai.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record EventRspData(
    int p1PlayerType,
    int p2PlayerType
) {
    public static EventRspData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new EventRspData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static EventRspData parseFrom(java.util.List<ProtoField> fields) {
        return new EventRspData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
