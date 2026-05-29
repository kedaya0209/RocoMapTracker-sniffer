// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BytesColumnData(
    long id,
    List<BytesColumnData_ColumnData> columnData,
    DataLeaseInfo leaseInfo,
    boolean requireInsert
) {
    public static BytesColumnData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BytesColumnData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BytesColumnData_ColumnData::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
    public static BytesColumnData parseFrom(java.util.List<ProtoField> fields) {
        return new BytesColumnData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BytesColumnData_ColumnData::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DataLeaseInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
}
