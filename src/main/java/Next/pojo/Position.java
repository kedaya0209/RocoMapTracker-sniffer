// Generated from com_base_types.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record Position(
    int x,
    int y,
    int z
) {
    public static Position parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Position(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static Position parseFrom(java.util.List<ProtoField> fields) {
        return new Position(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
