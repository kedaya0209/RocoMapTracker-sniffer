// Generated from com_bookshelf.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BookData(
    int bookType,
    int bookId,
    boolean unlock,
    int unlockTimestamp,
    BookData_NightmareData nightmareData,
    BookData_BloodMagicData bloodMagicData,
    BookData_NotebookKeliData notebookKeliData
) {
    public static BookData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BookData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BookData_NightmareData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BookData_BloodMagicData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BookData_NotebookKeliData.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static BookData parseFrom(java.util.List<ProtoField> fields) {
        return new BookData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BookData_NightmareData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BookData_BloodMagicData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BookData_NotebookKeliData.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
