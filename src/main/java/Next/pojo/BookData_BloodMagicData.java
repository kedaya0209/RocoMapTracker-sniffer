// Generated from com_bookshelf.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BookData_BloodMagicData(
    boolean done,
    boolean reward
) {
    public static BookData_BloodMagicData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BookData_BloodMagicData(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static BookData_BloodMagicData parseFrom(java.util.List<ProtoField> fields) {
        return new BookData_BloodMagicData(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
