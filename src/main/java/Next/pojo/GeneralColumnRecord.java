// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GeneralColumnRecord(
    long id,
    long id2,
    long id3,
    long id4,
    long id5,
    List<GeneralColumnField> fieldList,
    DataLeaseInfo leaseInfo,
    int version
) {
    public static GeneralColumnRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GeneralColumnRecord(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.GeneralColumnField::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8)
        );
    }
    public static GeneralColumnRecord parseFrom(java.util.List<ProtoField> fields) {
        return new GeneralColumnRecord(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.GeneralColumnField::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8)
        );
    }
}
