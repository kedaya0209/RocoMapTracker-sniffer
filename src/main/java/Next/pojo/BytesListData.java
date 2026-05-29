// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BytesListData(
    long id,
    long id2,
    long id3,
    long id4,
    long id5,
    long index,
    byte[] data,
    byte[] data2,
    DataLeaseInfo leaseInfo
) {
    public static BytesListData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BytesListData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static BytesListData parseFrom(java.util.List<ProtoField> fields) {
        return new BytesListData(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
