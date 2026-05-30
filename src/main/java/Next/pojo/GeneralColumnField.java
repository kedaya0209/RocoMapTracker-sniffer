// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GeneralColumnField(
    byte[] bytesVal,
    int int32Val,
    long int64Val,
    String strVal,
    long uint64Val
) {
    public static GeneralColumnField parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GeneralColumnField(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static GeneralColumnField parseFrom(java.util.List<ProtoField> fields) {
        return new GeneralColumnField(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
