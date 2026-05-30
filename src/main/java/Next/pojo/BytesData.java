// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BytesData(
    long id,
    long id2,
    long id3,
    long id4,
    long id5,
    List<Long> dataIndex,
    byte[] data,
    byte[] data2,
    DataLeaseInfo leaseInfo
) {
    public static BytesData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BytesData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLongList(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static BytesData parseFrom(java.util.List<ProtoField> fields) {
        return new BytesData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLongList(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
