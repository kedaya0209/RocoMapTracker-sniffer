// Generated from mail_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MailExcelHistory(
    List<Integer> history
) {
    public static MailExcelHistory parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailExcelHistory(
            Pojos.readIntList(fields, 1)
        );
    }
    public static MailExcelHistory parseFrom(java.util.List<ProtoField> fields) {
        return new MailExcelHistory(
            Pojos.readIntList(fields, 1)
        );
    }
}
