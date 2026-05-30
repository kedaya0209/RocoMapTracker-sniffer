// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GeneralColumnFieldInfo(
    String columnName,
    int columnType
) {
    public static GeneralColumnFieldInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GeneralColumnFieldInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static GeneralColumnFieldInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GeneralColumnFieldInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
