// Generated from com_base_types.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record Position2D(
    int x,
    int y
) {
    public static Position2D parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Position2D(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static Position2D parseFrom(java.util.List<ProtoField> fields) {
        return new Position2D(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
