// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GeneralColumnRecordList(
    List<GeneralColumnRecord> recordList
) {
    public static GeneralColumnRecordList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GeneralColumnRecordList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GeneralColumnRecord::parseFrom).toList()
        );
    }
    public static GeneralColumnRecordList parseFrom(java.util.List<ProtoField> fields) {
        return new GeneralColumnRecordList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GeneralColumnRecord::parseFrom).toList()
        );
    }
}
