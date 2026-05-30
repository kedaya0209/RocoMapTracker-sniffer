// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PermanentNpcInfo(
    long objId,
    long logicId
) {
    public static PermanentNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PermanentNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static PermanentNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PermanentNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
