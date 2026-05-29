// Generated from com_bookshelf.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BookData_NightmareData(
    boolean done
) {
    public static BookData_NightmareData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BookData_NightmareData(
            Pojos.readBool(fields, 1)
        );
    }
    public static BookData_NightmareData parseFrom(java.util.List<ProtoField> fields) {
        return new BookData_NightmareData(
            Pojos.readBool(fields, 1)
        );
    }
}
