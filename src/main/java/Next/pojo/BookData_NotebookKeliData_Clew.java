// Generated from com_bookshelf.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BookData_NotebookKeliData_Clew(
    int stage,
    boolean isNew,
    int unlock
) {
    public static BookData_NotebookKeliData_Clew parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BookData_NotebookKeliData_Clew(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static BookData_NotebookKeliData_Clew parseFrom(java.util.List<ProtoField> fields) {
        return new BookData_NotebookKeliData_Clew(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
