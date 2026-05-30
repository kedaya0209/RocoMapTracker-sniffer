// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BytesColumnData_ColumnData(
    String columnName,
    byte[] data
) {
    public static BytesColumnData_ColumnData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BytesColumnData_ColumnData(
            Pojos.readString(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static BytesColumnData_ColumnData parseFrom(java.util.List<ProtoField> fields) {
        return new BytesColumnData_ColumnData(
            Pojos.readString(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
