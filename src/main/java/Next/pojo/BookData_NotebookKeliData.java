// Generated from com_bookshelf.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BookData_NotebookKeliData(
    List<Boolean> toDoDone,
    List<BookData_NotebookKeliData_Clew> clews,
    BookData_NotebookKeliData_Clew blackText,
    int medalState
) {
    public static BookData_NotebookKeliData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BookData_NotebookKeliData(
            Pojos.readBoolList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BookData_NotebookKeliData_Clew::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BookData_NotebookKeliData_Clew.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
    public static BookData_NotebookKeliData parseFrom(java.util.List<ProtoField> fields) {
        return new BookData_NotebookKeliData(
            Pojos.readBoolList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BookData_NotebookKeliData_Clew::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BookData_NotebookKeliData_Clew.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
}
